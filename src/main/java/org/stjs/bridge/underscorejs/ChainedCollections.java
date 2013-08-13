package org.stjs.bridge.underscorejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback3;
import org.stjs.javascript.functions.Function1;
import org.stjs.javascript.functions.Function4;

interface ChainedCollections {
	public <T> ChainedUnderscoreJS each(Callback3<T, Integer, Array<T>> iterator);

	public <T> ChainedUnderscoreJS each(Callback3<T, Integer, Array<T>> iterator, Object context);

	public <T> ChainedUnderscoreJS map(Callback3<T, Integer, Array<T>> iterator);

	public <T> ChainedUnderscoreJS map(Callback3<T, Integer, Array<T>> iterator, Object context);

	public <T, R> ChainedUnderscoreJS reduce(Function4<R, T, Integer, Array<T>, R> iterator, R memo);

	public <T, R> ChainedUnderscoreJS reduce(Function4<R, T, Integer, Array<T>, R> iterator, R memo, Object context);

	public <T, R> ChainedUnderscoreJS reduceRight(Function4<R, T, Integer, Array<T>, R> iterator, R memo);

	public <T, R> ChainedUnderscoreJS reduceRight(Function4<R, T, Integer, Array<T>, R> iterator, R memo, Object context);

	public <T> ChainedUnderscoreJS find(Function1<T, Boolean> iterator);

	public <T> ChainedUnderscoreJS find(Function1<T, Boolean> iterator, Object context);

	public <T> ChainedUnderscoreJS filter(Function1<T, Boolean> iterator);

	public <T> ChainedUnderscoreJS filter(Function1<T, Boolean> iterator, Object context);

	public <T> ChainedUnderscoreJS where(Map<String, ? extends Object> properties);

	public <T> ChainedUnderscoreJS findWhere(Map<String, ? extends Object> properties);

	public <T> ChainedUnderscoreJS reject(Function1<T, Boolean> iterator);

	public <T> ChainedUnderscoreJS reject(Function1<T, Boolean> iterator, Object context);

	public <T> ChainedUnderscoreJS every(Array<T> list);

	public <T> ChainedUnderscoreJS every(Function1<T, Boolean> iterator);

	public <T> ChainedUnderscoreJS every(Function1<T, Boolean> iterator, Object context);

	public <T> ChainedUnderscoreJS some(Array<T> list);

	public <T> ChainedUnderscoreJS some(Function1<T, Boolean> iterator);

	public <T> ChainedUnderscoreJS some(Function1<T, Boolean> iterator, Object context);

	public <T> ChainedUnderscoreJS contains(T value);

	public <T> ChainedUnderscoreJS invoke(Object method, Object... arguments);

	public <T> ChainedUnderscoreJS pluck(String propertyName);

	public <T> ChainedUnderscoreJS max();

	public <T, M> ChainedUnderscoreJS max(Function1<T, M> iterator);

	public <T, M> ChainedUnderscoreJS max(Function1<T, M> iterator, Object context);

	public <T> ChainedUnderscoreJS min();

	public <T, M> ChainedUnderscoreJS min(Function1<T, M> iterator);

	public <T, M> ChainedUnderscoreJS min(Function1<T, M> iterator, Object context);

	public <T> ChainedUnderscoreJS sortBy(Function1<T, T> iterator);

	public <T> ChainedUnderscoreJS sortBy(Function1<T, T> iterator, Object context);

	public <T> ChainedUnderscoreJS sortBy(String property);

	public <T> ChainedUnderscoreJS sortBy(String property, Object context);

	public <T> ChainedUnderscoreJS groupBy(Function1<T, T> iterator);

	public <T> ChainedUnderscoreJS groupBy(Function1<T, T> iterator, Object context);

	public <T> ChainedUnderscoreJS groupBy(String property);

	public <T> ChainedUnderscoreJS groupBy(String property, Object context);

	public <T> ChainedUnderscoreJS countBy(Function1<T, T> iterator);

	public <T> ChainedUnderscoreJS countBy(Function1<T, T> iterator, Object context);

	public <T> ChainedUnderscoreJS countBy(String property);

	public <T> ChainedUnderscoreJS countBy(String property, Object context);

	public <T> ChainedUnderscoreJS shuffle();

	public <T> ChainedUnderscoreJS toArray();

	public <T> ChainedUnderscoreJS size();
}
