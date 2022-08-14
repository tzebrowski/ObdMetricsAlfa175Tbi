package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Disabled
public class EngineLoadTest implements Alfa175Tbi_Test {
	@ParameterizedTest
	@CsvSource(value = { 
			"62181D10AB=100",
			}, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertCloseTo(input, Float.parseFloat(expected),01.f);
	}
}
