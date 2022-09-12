package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validFirstName();
        userRegistration.validLastName();
        userRegistration.validEmailId();
        userRegistration.ValidPhoneNumber();
        userRegistration.validPassword();

    }
    public void validFirstName() throws UserRegistrationException{
        Pattern pattern =Pattern.compile("^[A-Z]+[a-z A-Z]{2,}[0-9]*$");
        System.out.println("enter first name:");
        String firstName = scanner.next();
        Matcher match = pattern.matcher(firstName);
        if(match.matches())
            System.out.println("First name is valid");
        else
            throw new UserRegistrationException("enter valid First name");
    }
    public void validLastName() throws UserRegistrationException{
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        System.out.println("Enter user second name");
        String fName = scanner.next();
        Matcher match = pattern.matcher(fName);
        if (match.matches())
            System.out.println("Second name is Valid");
        else
            throw new UserRegistrationException("Enter Valid Last Name");
    }
    public void validEmailId() throws UserRegistrationException{
        Pattern pattern = Pattern.compile("^[a-z]*.[a-z 0-9]+@[a-z 0-9]+.[a-z]{2,3}(.[a-z]{2,3})*$");
        System.out.println("Enter user email");
        String email = scanner.nextLine();
        Matcher match = pattern.matcher(email);
        if (match.matches())
            System.out.println("Email name is Valid");
        else
            throw new UserRegistrationException("Enter Valid email ");
    }
    public void ValidPhoneNumber()throws UserRegistrationException{
        Pattern pattern = Pattern.compile("^[9][1]\s[6-9][0-9]{9}$");
        System.out.println("Enter user Phone number");
        String phoneNumber = scanner.nextLine();
        Matcher match = pattern.matcher(phoneNumber);
        if (match.matches())
            System.out.println("Phone number is Valid");
        else
            throw new UserRegistrationException("Enter Valid phone-number ");

    }
    public void validPassword() throws UserRegistrationException{
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$");
        System.out.println("Enter user Password");
        String password = scanner.nextLine();
        Matcher match = pattern.matcher(password);
        if (match.matches())
            System.out.println("password is Valid");
        else
            throw new UserRegistrationException("Enter Valid password ");
    }
}
