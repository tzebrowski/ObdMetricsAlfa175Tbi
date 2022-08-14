package org.obd.metrics.codec.alfa_175_tbi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class OilTempTest implements Alfa175Tbi_Test {
	
	@ParameterizedTest
	@CsvSource(value = {
			"62194F2D85=0",
			"62194F2DC5=1",
			"62194F2DA5=1",
			"62194F2E25=3",
	        "62194F2E45=4",
			"62194F2FA5=11",
			"62194F30E5=20",
			"62194F3725=57",
			"62194F3745=58",
			"62194F3CE5=92",
			"62194F3BC5=86",
			"62194F3B85=85",
	        "62194F3E65=99",
	        "62194F3F45=104",
	         }, delimiter = '=')
	public void parameterizedTest(String input, String expected) {
		assertCloseTo(input, Float.parseFloat(expected),3);
	}
}
