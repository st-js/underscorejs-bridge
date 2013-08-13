package org.stjs.bridge.underscorejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.functions.Function1;

interface Objects {
	public Array<String> keys(Object object);

	public Array<? extends Object> values(Object object);

	public Array<Array<? extends Object>> pairs(Object object);

	public <T> T invert(Object object);

	public Array<String> functions(Object object);

	public <T> T extend(T destination, T... sources);

	public <T> T pick(T destination, String... keys);

	public <T> T omit(T destination, String... keys);

	public <T> T defaults(T destination, T... defaults);

	public <T> T clone(T object);

	public <T> void tap(T object, Function1<T, T> interceptor);

	public boolean has(Object object, String key);

	public <T> boolean isEqual(T object, T other);

	public boolean isEmpty(Object object);

	public boolean isElement(Object object);

	public boolean isArray(Object object);

	public boolean isObject(Object object);

	public boolean isArguments(Object object);

	public boolean isFunction(Object object);

	public boolean isString(Object object);

	public boolean isNumber(Object object);

	public boolean isFinite(Object object);

	public boolean isBoolean(Object object);

	public boolean isDate(Object object);

	public boolean isRegExp(Object object);

	public boolean isNaN(Object object);

	public boolean isNull(Object object);

	public boolean isUndefined(Object object);
}
