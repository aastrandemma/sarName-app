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
}