package com.github.aastrandemma;

import java.util.Arrays;

public class NameRepository {
    private static String[] nameStorage = {"Erik Svensson"};

    public static String find(final String fullName) {
        for (String name : nameStorage) {
            if (fullName.equalsIgnoreCase(name)) {
                return name;
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {
        String checkFullName = find(fullName);
        if (checkFullName == null) {
            nameStorage = addFullNameToArray(fullName);
        } else {
            return false;
        }
        return  true;
    }

    private static String[] addFullNameToArray(String fullName) {
        String[] newNameStorage = Arrays.copyOf(nameStorage, nameStorage.length + 1);
        newNameStorage[newNameStorage.length - 1] = fullName;
        return newNameStorage;
    }
}