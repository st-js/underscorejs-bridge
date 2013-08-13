package org.stjs.bridge.underscorejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback3;
import org.stjs.javascript.functions.Function1;
import org.stjs.javascript.functions.Function4;

interface Collections {
	public <T> void each(Array<T> list, Callback3<T, Integer, Array<T>> iterator);

	public <T> void each(Array<T> list, Callback3<T, Integer, Array<T>> iterator, Object context);

	public void each(Object list, Callback3<Object, String, Object> iterator);

	public void each(Object list, Callback3<Object, String, Object> iterator, Object context);

	public <T> Array<T> map(Array<T> list, Callback3<T, Integer, Array<T>> iterator);

	public <T> Array<T> map(Array<T> list, Callback3<T, Integer, Array<T>> iterator, Object context);

	public Array<?> map(Object list, Callback3<Object, String, Object> iterator);

	public Array<?> map(Object list, Callback3<Object, String, Object> iterator, Object context);

	public <T, R> R reduce(Array<T> list, Function4<R, T, Integer, Array<T>, R> iterator, R memo);

	public <T, R> R reduce(Array<T> list, Function4<R, T, Integer, Array<T>, R> iterator, R memo, Object context);

	public <T, R> R reduce(Object list, Function4<R, T, Integer, Array<T>, R> iterator, R memo);

	public <T, R> R reduce(Object list, Function4<R, T, Integer, Array<T>, R> iterator, R memo, Object context);

	public <T, R> R reduceRight(Array<T> list, Function4<R, T, Integer, Array<T>, R> iterator, R memo);

	public <T, R> R reduceRight(Array<T> list, Function4<R, T, Integer, Array<T>, R> iterator, R memo, Object context);

	public <T, R> R reduceRight(Object list, Function4<R, T, Integer, Array<T>, R> iterator, R memo);

	public <T, R> R reduceRight(Object list, Function4<R, T, Integer, Array<T>, R> iterator, R memo, Object context);

	public <T> T find(Array<T> list, Function1<T, Boolean> iterator);

	public <T> T find(Array<T> list, Function1<T, Boolean> iterator, Object context);

	public <T> Array<T> filter(Array<T> list, Function1<T, Boolean> iterator);

	public <T> Array<T> filter(Array<T> list, Function1<T, Boolean> iterator, Object context);

	public <T> Array<T> where(Array<T> list, Map<String, ? extends Object> properties);

	public <T> T findWhere(Array<T> list, Map<String, ? extends Object> properties);

	public <T> Array<T> reject(Array<T> list, Function1<T, Boolean> iterator);

	public <T> Array<T> reject(Array<T> list, Function1<T, Boolean> iterator, Object context);

	public <T> boolean every(Array<T> list);

	public <T> boolean every(Array<T> list, Function1<T, Boolean> iterator);

	public <T> boolean every(Array<T> list, Function1<T, Boolean> iterator, Object context);

	public <T> boolean some(Array<T> list);

	public <T> boolean some(Array<T> list, Function1<T, Boolean> iterator);

	public <T> boolean some(Array<T> list, Function1<T, Boolean> iterator, Object context);

	public <T> boolean contains(Array<T> list, T value);

	public <T> Array<T> invoke(Array<T> list, Object method, Object... arguments);

	public <T> Array<?> pluck(Array<T> list, String propertyName);

	public <T> T max(Array<T> list);

	public <T, M> M max(Array<T> list, Function1<T, M> iterator);

	public <T, M> M max(Array<T> list, Function1<T, M> iterator, Object context);

	public <T> T min(Array<T> list);

	public <T, M> M min(Array<T> list, Function1<T, M> iterator);

	public <T, M> M min(Array<T> list, Function1<T, M> iterator, Object context);

	public <T> Array<T> sortBy(Array<T> list, Function1<T, T> iterator);

	public <T> Array<T> sortBy(Array<T> list, Function1<T, T> iterator, Object context);

	public <T> Array<T> sortBy(Array<T> list, String property);

	public <T> Array<T> sortBy(Array<T> list, String property, Object context);

	public <T> Map<String, Array<T>> groupBy(Array<T> list, Function1<T, T> iterator);

	public <T> Map<String, Array<T>> groupBy(Array<T> list, Function1<T, T> iterator, Object context);

	public <T> Map<String, Array<T>> groupBy(Array<T> list, String property);

	public <T> Map<String, Array<T>> groupBy(Array<T> list, String property, Object context);

	public <T> Map<String, Integer> countBy(Array<T> list, Function1<T, T> iterator);

	public <T> Map<String, Integer> countBy(Array<T> list, Function1<T, T> iterator, Object context);

	public <T> Map<String, Integer> countBy(Array<T> list, String property);

	public <T> Map<String, Integer> countBy(Array<T> list, String property, Object context);

	public <T> Array<T> shuffle(Array<T> list);

	public <T> Array<T> toArray(Object list);

	public <T> int size(Array<T> list);
}
