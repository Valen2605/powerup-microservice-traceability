package com.pragma.powerup.traceabilitymicroservice.configuration.security.exception;



public class TokenException extends RuntimeException{
    public TokenException() {
        super("A problem with the token has occurred");
    }
}
