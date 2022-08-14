package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MeasuredAirMassFlowTest implements Alfa175Tbi_Test {

	@ParameterizedTest
	@CsvSource(value = { 
			"62180E0059=8.9",
			"62180E0069=10.5", 
			"62180E015C=34.8",
			"62180E115C=444.4"}, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertEquals(6013l,input, Double.parseDouble(expected));
	}
}
