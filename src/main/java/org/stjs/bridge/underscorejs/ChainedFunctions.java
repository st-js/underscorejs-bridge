package org.stjs.bridge.underscorejs;

interface ChainedFunctions {
	public ChainedUnderscoreJS bind(Object object, Object... arguments);

	public ChainedUnderscoreJS bindAll(String... methodNames);

	public ChainedUnderscoreJS partial(Object... arguments);

	public ChainedUnderscoreJS memoize();

	public <H> ChainedUnderscoreJS memoize(H hashFunction);

	public ChainedUnderscoreJS delay(int wait, Object... arguments);

	public ChainedUnderscoreJS defer(Object... arguments);

	public ChainedUnderscoreJS throttle(int wait);

	public ChainedUnderscoreJS throttle(int wait, ThrottleOptions options);

	public ChainedUnderscoreJS debounce(int wait);

	public ChainedUnderscoreJS debounce(int wait, boolean immediate);

	public ChainedUnderscoreJS once();

	public <F> ChainedUnderscoreJS after(F function);

	public <W> ChainedUnderscoreJS wrap(W wrapper);

	public ChainedUnderscoreJS compose(Object... functions);
}
