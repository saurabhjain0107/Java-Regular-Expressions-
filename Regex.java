package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public void firstName() {
        Pattern pattern = Pattern.compile("^[A-Z][a-z A-Z]{2,}");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name :");
        String FirstName = sc.nextLine();
        Matcher matcher = pattern.matcher(FirstName);
        if (matcher.matches()) {
            System.out.println("First name is valid : ");
        }
        else {
            System.out.println("First name is Invalid : ");

        }
    }
    public  void lastName(){
        Pattern pattern = Pattern.compile("^[A-Z][a-z A-Z]{2,}");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter last name :");
        String lastname = sc.nextLine();
        Matcher matcher = pattern.matcher(lastname);
        if(matcher.matches()){
            System.out.println("last name in valid : ");
        }
        else{
            System.out.println("last name is Invalid : ");
        }
    }
    public void validEmailId(){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+ ([.][a-zA-Z0-9]+)* @ [a-z]+ ([.][a-z])* ([.][a-z]+)$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email id :");
        String email = sc.nextLine();
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            System.out.println("Valid Email Id");
        }
        else {
            System.out.println("Invalid Email Id");
        }
    }
    public  void mobileNumber(){
        Pattern pattern = Pattern.compile("^[0-9]{2}\s[6-9][0-9]{9}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile number with country code :");
        String phoneNumber = sc.nextLine();
        Matcher matcher = pattern.matcher(phoneNumber);
        if(matcher.matches()){
            System.out.println("phone number is valid :");
        }
        else{
            System.out.println("phone number is Invalid :");
        }
    }
    public static void main(String[] args) {
        Regex regex = new Regex();
        regex.firstName();
        regex.lastName();
        regex.validEmailId();
        regex.mobileNumber();

    }
}
