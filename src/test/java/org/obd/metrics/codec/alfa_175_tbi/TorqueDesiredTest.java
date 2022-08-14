package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TorqueDesiredTest implements Alfa175Tbi_Test {
	@ParameterizedTest
	@CsvSource(value = { 
			"6218AE5904=34.77",
			"6218AE40E2=25.43",
			"6218AE0E3A=5.36",
			"6218AE1830=9.37",	
			}, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertCloseTo(input, Float.parseFloat(expected),01.f);
	}
}
