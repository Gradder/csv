package com.gradder.csv.exception;

public class CsvGenerationException extends RuntimeException {

    public CsvGenerationException(String message, Exception e) {
        super(message + e.getMessage());
    }
}
