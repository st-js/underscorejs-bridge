package org.stjs.bridge.underscorejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Function1;

interface Arrays {
	// ARRAYS
	public <T> T first(Array<T> array);

	public <T> Array<T> first(Array<T> array, int n);

	public <T> Array<T> initial(Array<T> array);

	public <T> Array<T> initial(Array<T> array, int n);

	public <T> T last(Array<T> array);

	public <T> Array<T> last(Array<T> array, int n);

	public <T> Array<T> rest(Array<T> array);

	public <T> Array<T> rest(Array<T> array, int n);

	public <T> Array<T> compact(Array<T> array);

	public <T, R> Array<R> flatten(Array<T> array);

	public <T, R> Array<R> flatten(Array<T> array, boolean shallow);

	public <T> Array<T> without(Array<T> list, T... values);

	public <T> Array<T> without(Array<T> list, Array<T> values);

	public <T> Array<T> union(Array<T>... arrays);

	public <T> Array<T> intersection(Array<T>... arrays);

	public <T> Array<T> difference(Array<T> array, Array<T>... others);

	public <T> Array<T> uniq(Array<T> array);

	public <T> Array<T> uniq(Array<T> array, boolean isSorted);

	public <T> Array<T> uniq(Array<T> array, boolean isSorted, Function1<T, T> iterator);

	public <T, R> Array<R> zip(Array<T>... arrays);

	public <R> R object(Array<String> keys, Array<?> values);

	public <R> R object(Array<Map<String, ?>> list);

	public <T> int indexOf(Array<T> array, T value);

	public <T> int indexOf(Array<T> array, T value, boolean isSorted);

	public <T> int lastTndexOf(Array<T> array, T value);

	public <T> int lastTndexOf(Array<T> array, T value, int fromIndex);

	public <T> int sortedIndex(Array<T> array, T value);

	public <T, V> int sortedIndex(Array<T> list, V value, Function1<T, V> iterator);

	public <T, V> int sortedIndex(Array<T> list, V value, Function1<T, V> iterator, Object context);

	public <T> int sortedIndex(Array<T> list, Object value, String property);

	public <T> int sortedIndex(Array<T> list, Object value, String property, Object context);

	public Array<Integer> range(int stop);

	public Array<Integer> range(int start, int stop);

	public Array<Integer> range(int start, int stop, int step);
}
