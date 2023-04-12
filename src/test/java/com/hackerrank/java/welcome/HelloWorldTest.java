package com.hackerrank.java.welcome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@SpringBootTest
public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        HelloWorld.main(new String[0]);

        String output = outputStream.toString().trim();
        String expectedOutput = "Hello, World." + System.lineSeparator() + "Hello, Java.";
        Assertions.assertEquals(expectedOutput, output);
    }
}
