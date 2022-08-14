package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FuelRailPressureMeasuredTest implements Alfa175Tbi_Test {
	
	@ParameterizedTest
	@CsvSource(value = { 
			"6219100521=0.65",	
			"62191017D7=3.028"
			}, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertCloseTo(input, Float.parseFloat(expected),0.1f);
	}
}
