package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BatterVoltageTest implements Alfa175Tbi_Test {

	@ParameterizedTest
	@CsvSource(value = { 
			"62100496=14.15", 
			"62100482=12.26",
			"62100484=12.45" }, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertEquals(input, Double.parseDouble(expected));
	}
}
