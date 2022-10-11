package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    public static void main(String[] args) throws  UserRegistrationException {
        Regex regex = new Regex();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        regex.name.validate(scanner.next());

        System.out.println("\nEnter last name: ");
        regex.name.validate(scanner.next());

        System.out.println("\nEnter email: ");
        regex.email.validate(scanner.next());

        System.out.println("\nEnter mobile no as per format: (e.g. 91 9867859848) ");
        scanner.nextLine();
        regex.mobileNo.validate(scanner.nextLine());

        System.out.println("\nEnter Password:");
        regex.password.validate(scanner.next());

        System.out.println("\nValid Emails: ");
        regex.email.validate(scanner.next());
    }
}
