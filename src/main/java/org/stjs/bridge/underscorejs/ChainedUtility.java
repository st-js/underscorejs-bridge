package org.stjs.bridge.underscorejs;

import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Function2;

interface ChainedUtility {
	public ChainedUnderscoreJS identity(Object value);

	public ChainedUnderscoreJS times(int n, Callback1<Integer> iterator);

	public <T> ChainedUnderscoreJS times(int n, Callback2<Integer, T> iterator, T context);

	public ChainedUnderscoreJS random(int min, int max);

	public ChainedUnderscoreJS uniqueId();

	public ChainedUnderscoreJS uniqueId(String prefix);

	public ChainedUnderscoreJS escape(String string);

	public ChainedUnderscoreJS unescape(String string);

	public ChainedUnderscoreJS result(Object object, String property);

	//TODO - this also are chained !?

	public Function2<Object, TemplateOptions, String> template(String templateString);

	public String template(String templateString, Object data);

	public String template(String templateString, Object data, TemplateOptions options);
}
