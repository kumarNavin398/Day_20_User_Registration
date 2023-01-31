package com.bridgelabz.UserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class InvalidUserInputException extends Exception
{
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        try {
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.firstNameValidate("Navin");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.firstNameValidate("Navin");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.lastNameValidate("Singh");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.lastNameValidate("Singh");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.phoneNumberValidate("91 7070100474");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.phoneNumberValidate("7070100474");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.passwordValidate("Kruna23#%");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }
}
