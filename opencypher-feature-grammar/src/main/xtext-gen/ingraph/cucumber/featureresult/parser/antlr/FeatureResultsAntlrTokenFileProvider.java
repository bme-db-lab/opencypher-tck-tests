/*
 * generated by Xtext 2.10.0
 */
package ingraph.cucumber.featureresult.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FeatureResultsAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("ingraph/cucumber/featureresult/parser/antlr/internal/InternalFeatureResults.tokens");
	}
}