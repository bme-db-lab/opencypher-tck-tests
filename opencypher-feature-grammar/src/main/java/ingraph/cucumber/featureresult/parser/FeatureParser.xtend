package ingraph.cucumber.featureresult.parser

import ingraph.cucumber.featureresult.FeatureResultsStandaloneSetup
import ingraph.cucumber.featureresult.featureResults.FeatureValue
import java.io.ByteArrayInputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.Issue

class FeatureParser {

    def static FeatureValue parseString(String queryString) {
        // https://wiki.eclipse.org/Xtext/FAQ
        val injector = new FeatureResultsStandaloneSetup().createInjectorAndDoEMFRegistration()
        val resourceSet = injector.getInstance(XtextResourceSet)
        val resource = resourceSet.createResource(URI.createURI("http:/example.featureresult"))
        val in = new ByteArrayInputStream(queryString.getBytes())
        resource.load(in, resourceSet.getLoadOptions())
        validateAndThrowError(resource)
        return resource.contents.get(0) as FeatureValue
    }

    def protected static validateAndThrowError(Resource resource) {
        var seenError = false
        var String firstError = null
        val validator = (resource as XtextResource).getResourceServiceProvider().getResourceValidator()
        val issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl)
        for (Issue issue : issues) {
            if (issue.severity == Severity.ERROR && !seenError) {
                seenError = true
                firstError = issue.message
            }
            println(issue.message)
        }
        if (seenError) {
            throw new RuntimeException('''Error during cypher parse, the first error was: «firstError»''')
        }
    }

}