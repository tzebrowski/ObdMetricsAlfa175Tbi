package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ThrottleAngleTest implements Alfa175Tbi_Test {
	@ParameterizedTest
	@CsvSource(value = { 
			"621862010A=6.49",	
	        "621862010C=6.643",
			}, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertCloseTo(input, Float.parseFloat(expected), 1.0f);
	}
}
