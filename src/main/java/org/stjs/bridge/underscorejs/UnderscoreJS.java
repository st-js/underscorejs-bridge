package org.stjs.bridge.underscorejs;

import org.stjs.javascript.functions.Function2;

public interface UnderscoreJS extends Arrays, Collections, Objects {

	// UTILITY
	public Function2<Object, TemplateOptions, String> template(String templateString);

	public String template(String templateString, Object data);

	public String template(String templateString, Object data, TemplateOptions options);

	// FUNCTIONS

}
