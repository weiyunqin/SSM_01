package com.gky.exception;

public class OtherThingsException extends Exception {
    public OtherThingsException(String message) {
        super(message);
    }
    public OtherThingsException(Exception e){
        this(e.getMessage());
    }

    public OtherThingsException(String message, Throwable cause) {
        super(message, cause);
    }
}