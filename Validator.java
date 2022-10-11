package com.bridgelabz;

public interface Validator {
    boolean validate(String data) throws UserRegistrationException;
}
