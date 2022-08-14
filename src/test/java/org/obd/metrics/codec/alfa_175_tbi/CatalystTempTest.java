package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Disabled
public class CatalystTempTest implements Alfa175Tbi_Test {
	// 18370E = 20
	
	@ParameterizedTest
	@CsvSource(value = { 
			"6218371E=60.0",
	        "6218370E=20.0",
	        "6218370D=15.0",
			}, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertEquals(input, Float.parseFloat(expected));
	}
}
