package org.stjs.bridge.underscorejs;

import org.stjs.javascript.Array;

interface Arrays {
	// ARRAYS

	public <T> void invoke(Array<T> list, Object method, Object... arguments);

	public <T> T last(Array<T> array);

	public <T> Array<T> last(Array<T> array, int n);

	public <T> Array<T> without(Array<T> list, T... values);

	public <T> Array<T> without(Array<T> list, Array<T> values);
}
