package org.stjs.bridge.underscorejs;

import org.stjs.javascript.Array;
import org.stjs.javascript.functions.Callback3;
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

}
