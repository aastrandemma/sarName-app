package com.github.aastrandemma;

public class NameData {
    private static final String[] nameStorage = {"Erik Svensson"};

    public static String find(final String fullName) {
        for (String name : nameStorage) {
            if (fullName.equalsIgnoreCase(name)) {
                return name;
            }
        }
        return null;
    }
}