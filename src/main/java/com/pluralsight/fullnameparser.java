package com.pluralsight;

import java.util.Scanner;

public class fullnameparser {

    public static <Strings> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //What is the user full name

        System.out.print(" Enter your Full name:");
        String fullName = scanner.nextLine();

        // Remove extra spaces
        fullName = fullName.trim();

        // Split the name
        String[] names = fullName.split("\\s+");

        String firstName = names[0];
        String middleName = "(none)";
        String lastName;

        // Check the number of names
        if (names.length == 2) {
            lastName = names[1];
        } else {
            middleName = names[1];
            lastName = names[2];
        }

        // Display the names
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        scanner.close();


    }
}
