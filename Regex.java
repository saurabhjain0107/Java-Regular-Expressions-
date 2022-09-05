package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public void isFirstName() {
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
    public  void isLastName(){
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
    public static void main(String[] args) {
        Regex regex = new Regex();
        regex.isFirstName();
        regex.isLastName();

    }
}
