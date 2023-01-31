package com.bridgelabz.UserRegistration;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest
{
    UserRegistrationMain userRegistration = new UserRegistrationMain();
    Function<List<String>, List<Boolean>> firstNameTestCases = cases -> cases.stream().map(x -> {
        try {
            return userRegistration.firstNameValidate.userEntries(x);
        } catch (InvalidUserInputException e) {
            // TODO Auto-generated catch block

        }
        return false;
    }).collect(Collectors.toList());

    Function<List<String>, List<Boolean>> lastNameTestCases = cases -> cases.stream().map(x -> {
        try {
            return userRegistration.lastNameValidate.userEntries(x);
        } catch (InvalidUserInputException e) {
            // TODO Auto-generated catch block

        }
        return false;
    }).collect(Collectors.toList());

    Function<List<String>, List<Boolean>> emailTestCases = cases -> cases.stream().map(x -> {
        try {
            return userRegistration.emailValidate.userEntries(x);
        } catch (InvalidUserInputException e) {
            // TODO Auto-generated catch block

        }
        return false;
    }).collect(Collectors.toList());

    Function<List<String>, List<Boolean>> phoneTestCases = cases -> cases.stream().map(x -> {
        try {
            return userRegistration.phoneNumberValidate.userEntries(x);
        } catch (InvalidUserInputException e) {
            // TODO Auto-generated catch block

        }
        return false;
    }).collect(Collectors.toList());

    Function<List<String>, List<Boolean>> passwordTestCases = cases -> cases.stream().map(x -> {
        try {
            return userRegistration.passwordValidate.userEntries(x);
        } catch (InvalidUserInputException e) {
            // TODO Auto-generated catch block

        }
        return false;
    }).collect(Collectors.toList());

    @Test
    public void test_firstName_Cases() {
        List<Boolean> result = firstNameTestCases.apply(Arrays.asList("Krunali"));
        List<Boolean> expected = Arrays.asList(true);
        assertEquals(expected, result);
    }

    @Test
    public void test_lastName_Cases() {
        List<Boolean> result = lastNameTestCases.apply(Arrays.asList("Lole"));
        List<Boolean> expected = Arrays.asList(true);
        assertEquals(expected, result);
    }

    @Test
    public void test_email_Cases() {
        List<Boolean> result = emailTestCases.apply(Arrays.asList("abc@1.com"));
        List<Boolean> expected = Arrays.asList(true);
        assertEquals(expected, result);
    }

    @Test
    public void test_phoneNumber_Cases() {
        List<Boolean> result = phoneTestCases.apply(Arrays.asList("91 9561272972"));
        List<Boolean> expected = Arrays.asList(true);
        assertEquals(expected, result);
    }

    @Test
    public void test_password_Cases() {
        List<Boolean> result = passwordTestCases.apply(Arrays.asList("Krunali@1999"));
        List<Boolean> expected = Arrays.asList(true);
        assertEquals(expected, result);
    }

}