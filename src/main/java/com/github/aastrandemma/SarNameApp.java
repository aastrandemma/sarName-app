package com.github.aastrandemma;

public class SarNameApp {
    public static void main( String[] args ) {
        displayMenuHeader();
        do {
            displayMenu();
        } while (true);
    }

    private static void displayMenuHeader() {
        System.out.println("----------------------------------");
        System.out.println("Search Add Remove Name Application");
        System.out.println("----------------------------------");
        System.out.println("Welcome! \nChoose from the menu what type of operation you want execute.");
    }
    private static void displayMenu() {
        System.out.println();
        System.out.println("----------Menu----------");
        System.out.println("Press 1 to search full name");
        System.out.println("Press 2 to add full name");
        System.out.println("Press 0 to exit the app");
    }
}