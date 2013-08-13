package org.stjs.bridge.underscorejs;

interface Functions {
	public <F, B> B bind(F function, Object object, Object... arguments);

	public void bindAll(Object object, String... methodNames);

	public <F, B> B partial(F function, Object... arguments);

	public <F> F memoize(F function);

	public <F, H> F memoize(F function, H hashFunction);

	public <F> void delay(F function, int wait, Object... arguments);

	public <F> void defer(F function, Object... arguments);

	public <F> F throttle(F function, int wait);

	public <F> F throttle(F function, int wait, ThrottleOptions options);

	public <F> F debounce(F function, int wait);

	public <F> F debounce(F function, int wait, boolean immediate);

	public <F> F once(F function);

	public <F> F after(int count, F function);

	public <F, W> F wrap(F function, W wrapper);

	public <F> F compose(Object... functions);
}
