package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class OilDegradationLevelTest implements Alfa175Tbi_Test {
	
	@ParameterizedTest
	@CsvSource(value = {
		"62381A5E=94.0",
	}, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertEquals(input, Double.parseDouble(expected));
	}
}
