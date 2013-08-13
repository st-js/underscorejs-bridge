package org.stjs.bridge.underscorejs;

import org.stjs.javascript.functions.Function1;

interface ChainedObjects {
	public ChainedUnderscoreJS keys();

	public ChainedUnderscoreJS values();

	public ChainedUnderscoreJS pairs();

	public ChainedUnderscoreJS invert();

	public ChainedUnderscoreJS functions();

	public <T> ChainedUnderscoreJS extend(T... sources);

	public <T> ChainedUnderscoreJS pick(String... keys);

	public <T> ChainedUnderscoreJS omit(String... keys);

	public <T> ChainedUnderscoreJS defaults(T... defaults);

	public ChainedUnderscoreJS clone();

	public <T> ChainedUnderscoreJS tap(Function1<T, T> interceptor);

	public ChainedUnderscoreJS has(String key);

	public <T> ChainedUnderscoreJS isEqual(T other);

	public ChainedUnderscoreJS isEmpty();

	public ChainedUnderscoreJS isElement();

	public ChainedUnderscoreJS isArray();

	public ChainedUnderscoreJS isObject();

	public ChainedUnderscoreJS isArguments();

	public ChainedUnderscoreJS isFunction();

	public ChainedUnderscoreJS isString();

	public ChainedUnderscoreJS isNumber();

	public ChainedUnderscoreJS isFinite();

	public ChainedUnderscoreJS isBoolean();

	public ChainedUnderscoreJS isDate();

	public ChainedUnderscoreJS isRegExp();

	public ChainedUnderscoreJS isNaN();

	public ChainedUnderscoreJS isNull();

	public ChainedUnderscoreJS isUndefined();
}
