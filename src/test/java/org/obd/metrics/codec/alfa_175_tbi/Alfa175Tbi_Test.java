package org.obd.metrics.codec.alfa_175_tbi;

import org.obd.metrics.codec.CodecTest;

public interface Alfa175Tbi_Test extends CodecTest {
	final String RESOURCE_NAME = "alfa_175tbi.json";
	
	default void assertEquals(long id, String actualValue, Object expectedValue) {
		assertEquals(false, actualValue.substring(2, 6), id, RESOURCE_NAME, actualValue, expectedValue);
	}

	default void assertEquals(boolean debug, String actualValue, Object expectedValue) {
		assertEquals(debug, actualValue.substring(2, 6), null, RESOURCE_NAME, actualValue, expectedValue);
	}

	default void assertEquals(String actualValue, Object expectedValue) {
		assertEquals(actualValue.substring(2, 6), RESOURCE_NAME, actualValue, expectedValue);
	}

	default void assertCloseTo(String actualValue, float expectedValue, float offset) {
		assertCloseTo(false, actualValue.substring(2, 6), RESOURCE_NAME, actualValue, expectedValue, offset);
	}
}
