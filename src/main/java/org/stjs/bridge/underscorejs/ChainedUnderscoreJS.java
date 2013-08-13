package org.stjs.bridge.underscorejs;

interface ChainedUnderscoreJS extends ChainedArrays, ChainedCollections, ChainedFunctions, ChainedObjects, ChainedUtility {
	public <T> T value();
}
