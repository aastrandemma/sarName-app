package com.github.aastrandemma;

import java.util.Scanner;

public class UserData {
    public static int getUserInputOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter choice from the menu:");
        return scanner.nextInt();
    }

    public static String getUserInputFullName(String perform) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name to " + perform + ":");
        return scanner.nextLine();
    }
}