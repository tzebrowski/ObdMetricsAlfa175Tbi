package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TargetIntakePressureTest implements Alfa175Tbi_Test {

	@ParameterizedTest
	@CsvSource(value = {
			"62181F63CE= 990.0", 
			"62181F2424=360.0" }, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertEquals(input, Double.parseDouble(expected));
	}
}
