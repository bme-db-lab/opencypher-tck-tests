/*
 * generated by Xtext 2.10.0
 */
package ingraph.cucumber.featureresult.tests

import com.google.inject.Inject
import ingraph.cucumber.featureresult.featureResults.Value
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(FeatureResultsInjectorProvider)
class FeatureResultsParsingTest{

	@Inject
	ParseHelper<Value> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			(:Label {name: 'hello'})
		''')
		Assert.assertNotNull(result)
	}

}