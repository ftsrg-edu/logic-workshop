/*
 * generated by Xtext
 */
package hu.bme.mit.kk.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("hu/bme/mit/kk/dsl/parser/antlr/internal/InternalLanguage.tokens");
	}
}
