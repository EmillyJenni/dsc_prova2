package com.example.prova02.service;

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}