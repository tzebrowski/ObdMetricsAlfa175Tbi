package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FuelLevelTest implements Alfa175Tbi_Test {

	@ParameterizedTest
	@CsvSource(value = { 
			"62100122=17.0",
			"6210011E=15.0",
	}, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertEquals(input, Double.parseDouble(expected));
	}

}
