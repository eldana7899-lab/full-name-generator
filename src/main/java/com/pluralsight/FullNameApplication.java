package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask Entre First names

        System.out.print("Enter your first name:");
        String firstName = scanner.nextLine().trim();

        // ask for the last name to be entre

        System.out.print("Enter your middle name:");
        String middleName = scanner.nextLine().trim();

        // ask for the last name to be Entre

        System.out.print("Enter Last Name:");
        String LastName = scanner.nextLine().trim();

        // ask for their Suffix

        System.out.print("Entre suffix:");
        String suffix = scanner.nextLine().trim();



    }


}
