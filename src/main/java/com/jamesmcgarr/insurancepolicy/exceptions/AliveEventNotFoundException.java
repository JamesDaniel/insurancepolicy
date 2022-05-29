package com.jamesmcgarr.insurancepolicy.exceptions;

public class AliveEventNotFoundException extends RuntimeException {
    public AliveEventNotFoundException(String message) {
        super(message);
    }
}
