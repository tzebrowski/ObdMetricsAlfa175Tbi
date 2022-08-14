package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AtmosphericPressureTest implements Alfa175Tbi_Test {

	@ParameterizedTest
	@CsvSource(value = { 
			"62195664FC=1009.80"
	}, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertCloseTo(input, Float.parseFloat(expected),25f);
	}
}
