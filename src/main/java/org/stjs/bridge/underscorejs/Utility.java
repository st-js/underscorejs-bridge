package org.stjs.bridge.underscorejs;

import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Function2;

interface Utility {
	public UnderscoreJS noConflict();

	public <T> T identity(T value);

	public void times(int n, Callback1<Integer> iterator);

	public <T> void times(int n, Callback2<Integer, T> iterator, T context);

	public int random(int min, int max);

	public void mixin(Object object);

	public String uniqueId();

	public String uniqueId(String prefix);

	public String escape(String string);

	public String unescape(String string);

	public <T> T result(Object object, String property);

	public Function2<Object, TemplateOptions, String> template(String templateString);

	public String template(String templateString, Object data);

	public String template(String templateString, Object data, TemplateOptions options);
}
