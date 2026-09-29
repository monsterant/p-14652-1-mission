package com.back.global.exception;

import lombok.Getter;

@Getter
public class DomainException extends RuntimeException {
    String resultCode;
    public DomainException(String resultCode, String message) {
        super(message);
        this.resultCode = resultCode;
    }
}