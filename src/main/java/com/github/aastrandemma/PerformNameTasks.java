package com.github.aastrandemma;

public class PerformNameTasks {
    public static void findFullName() {
        String findName = UserData.getUserInputFullName("find");
        String foundName = NameData.find(findName);

        if (foundName == null) {
            System.out.println("The name " + findName + " does not exist.");
        } else {
            System.out.println("The name " + foundName + " was found.");
        }
    }

    public static void addFullName() {
        String addFullName = UserData.getUserInputFullName("add");
        boolean nameAdded = NameData.add(addFullName);

        if (nameAdded) {
            System.out.println("The name " + addFullName + " is added to the list.");
        } else {
            System.out.println("The name was not added. " + addFullName + " is already in the list.");
        }
    }
}