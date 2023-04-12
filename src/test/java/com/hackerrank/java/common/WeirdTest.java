package com.hackerrank.java.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class WeirdTest {

	@Test
	public void testCalculate() {
		Weird weird = new Weird();

		String result1 = weird.calculate(1);
		String expected1 = "Weird";
		Assertions.assertEquals(expected1, result1);

		String result2 = weird.calculate(2);
		String expected2 = "Not Weird";
		Assertions.assertEquals(expected2, result2);

		String result3 = weird.calculate(6);
		String expected3 = "Weird";
		Assertions.assertEquals(expected3, result3);

		String result4 = weird.calculate(22);
		String expected4 = "Not Weird";
		Assertions.assertEquals(expected4, result4);
	}
}
