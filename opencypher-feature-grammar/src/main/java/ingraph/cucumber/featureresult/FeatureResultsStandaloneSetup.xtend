/*
 * generated by Xtext 2.11.0-SNAPSHOT
 */
package ingraph.cucumber.featureresult


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class FeatureResultsStandaloneSetup extends FeatureResultsStandaloneSetupGenerated {

	def static void doSetup() {
		new FeatureResultsStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}