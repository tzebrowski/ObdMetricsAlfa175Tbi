package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TorqueDriverRequestTest implements Alfa175Tbi_Test {
	@ParameterizedTest
	@CsvSource(value = { 
			"6218C759=34.77",	
			"6218C730=18.75",	
	}, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertEquals(input, Double.parseDouble(expected));
	}
}
