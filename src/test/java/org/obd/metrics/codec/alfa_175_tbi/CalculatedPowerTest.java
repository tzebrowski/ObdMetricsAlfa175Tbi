package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatedPowerTest implements Alfa175Tbi_Test {

	@ParameterizedTest
	@CsvSource(value = { "62180E115C=164" }, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertEquals(6024l, input, Double.parseDouble(expected));
	}

}
