package org.stjs.bridge.underscorejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Function1;

interface ChainedArrays {
	// ARRAYS
	public ChainedUnderscoreJS first();

	public ChainedUnderscoreJS first(int n);

	public ChainedUnderscoreJS initial();

	public ChainedUnderscoreJS initial(int n);

	public ChainedUnderscoreJS last();

	public ChainedUnderscoreJS last(int n);

	public ChainedUnderscoreJS rest();

	public ChainedUnderscoreJS rest(int n);

	public ChainedUnderscoreJS compact();

	public ChainedUnderscoreJS flatten();

	public ChainedUnderscoreJS flatten(boolean shallow);

	public ChainedUnderscoreJS without(Object... values);

	public <T> ChainedUnderscoreJS without(Array<T> values);

	public <T> ChainedUnderscoreJS union(Array<T>... arrays);

	public <T> ChainedUnderscoreJS intersection(Array<T>... arrays);

	public <T> ChainedUnderscoreJS difference(Array<T>... others);

	public ChainedUnderscoreJS uniq();

	public ChainedUnderscoreJS uniq(boolean isSorted);

	public <T> ChainedUnderscoreJS uniq(boolean isSorted, Function1<T, T> iterator);

	public <T, R> ChainedUnderscoreJS zip(Array<T>... arrays);

	public ChainedUnderscoreJS object(Array<String> keys, Array<?> values);

	public ChainedUnderscoreJS object(Array<Map<String, ?>> list);

	public <T> ChainedUnderscoreJS indexOf(T value);

	public <T> ChainedUnderscoreJS indexOf(T value, boolean isSorted);

	public <T> ChainedUnderscoreJS lastTndexOf(T value);

	public <T> ChainedUnderscoreJS lastTndexOf(T value, int fromIndex);

	public <T> ChainedUnderscoreJS sortedIndex(T value);

	public <T, V> ChainedUnderscoreJS sortedIndex(V value, Function1<T, V> iterator);

	public <T, V> ChainedUnderscoreJS sortedIndex(V value, Function1<T, V> iterator, Object context);

	public ChainedUnderscoreJS sortedIndex(Object value, String property);

	public ChainedUnderscoreJS sortedIndex(Object value, String property, Object context);

	public ChainedUnderscoreJS range(int stop);

	public ChainedUnderscoreJS range(int start, int stop);

	public ChainedUnderscoreJS range(int start, int stop, int step);
}
