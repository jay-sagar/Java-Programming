package com.BasicsOfJava;

public class SwitchStatements {
    public static void main(String[] args) {
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break; // to jump out of this switch block

            case "moderator":
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }

        // Can use integers ( byte, short, integer ) other than the long type

        int number = 1;

        switch (number) {
            case 1:
                System.out.println("You're an admin");
                break; // to jump out of this switch block

            case 2:
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }
    }
}