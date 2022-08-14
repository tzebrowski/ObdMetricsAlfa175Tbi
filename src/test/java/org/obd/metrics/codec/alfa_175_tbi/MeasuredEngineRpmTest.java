package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MeasuredEngineRpmTest implements Alfa175Tbi_Test {

	@ParameterizedTest
	@CsvSource(value = { 
			"6210000000=0.0", 
			"6210000BBC=751.0", 
			"6210000BEA=762.5" }, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertEquals(input, Double.parseDouble(expected));
	}
}
