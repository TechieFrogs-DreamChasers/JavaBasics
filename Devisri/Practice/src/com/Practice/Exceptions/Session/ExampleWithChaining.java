package com.Practice.Exceptions.Session;

import java.io.IOException;

public class ExampleWithChaining {
    public static void main(String[] args) {
        try {
            // Step 1
            code1();
        } catch (ExampleException e) {
            // Step 7
            e.printStackTrace();
        }
    }

    static void code1() throws ExampleException {
        try {
            // Step 2
            code2();
        } catch (IOException e) {
            // Step 6
            throw new ExampleException("Exception thrown in code1() method!!!", e);
        }
    }

    static void code2() throws IOException {
        try {
            // Step 3
            code3();
        } catch (Exception e) {
            // Step 5
            throw new IOException("Exception thrown in code2() method!!!", e);
        }
    }

    static void code3() throws Exception {
        // Step 4
        throw new Exception("Exception thrown in code3() method!!!");
    }
}

class ExampleException extends Exception {
    public ExampleException(String message) {
        super(message);
    }

    public ExampleException(String message, Throwable cause) {
        super(message, cause);
    }
}