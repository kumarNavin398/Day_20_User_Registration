package com.bridgelabz.UserRegistration;


@FunctionalInterface
public interface UserRegistrationInterface
{
    public abstract boolean userEntries(String value) throws InvalidUserInputException;
}