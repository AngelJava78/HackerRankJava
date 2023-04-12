package com.hackerrank.java.stdinstdout;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

@SpringBootTest
public class SolutionTest {

	@Test
    public void testSolution() {
        String input = "1"+ System.lineSeparator() + "2"+ System.lineSeparator() + "3"+ System.lineSeparator();
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Solution.main(new String[0]);

        String output = outputStream.toString().trim();
        String expectedOutput = "1"+ System.lineSeparator() + "2"+ System.lineSeparator() + "3";
        Assertions.assertEquals(expectedOutput, output);
    }




}
