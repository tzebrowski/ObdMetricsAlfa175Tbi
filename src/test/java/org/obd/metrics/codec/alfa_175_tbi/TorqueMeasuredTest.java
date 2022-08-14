package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TorqueMeasuredTest implements Alfa175Tbi_Test {
	@ParameterizedTest
	@CsvSource(value = { 
			"6218AD1032=6.3",	
			}, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertCloseTo(input, Float.parseFloat(expected),0.1f);
	}
}
