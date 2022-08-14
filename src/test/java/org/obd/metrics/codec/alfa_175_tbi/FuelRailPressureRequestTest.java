package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FuelRailPressureRequestTest implements Alfa175Tbi_Test {
	@ParameterizedTest
	@CsvSource(value = { 
			"621911055A=0.681",	
			}, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertCloseTo(input, Float.parseFloat(expected),0.1f);
	}
}
