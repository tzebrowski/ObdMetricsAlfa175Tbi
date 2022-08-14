package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Disabled
public class ACPressureTest implements Alfa175Tbi_Test {

	@ParameterizedTest
	@CsvSource(value = { "62192F24=19.0" }, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertEquals(input, Double.parseDouble(expected));
	}
}
