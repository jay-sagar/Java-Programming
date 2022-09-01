package com.BasicsOfJava;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // System(.in) is used to with terminal window

        System.out.print("Name: ");
        String name = scanner.nextLine().trim(); // chaining methods
        System.out.println("Your name is " + name);
        // String name = scanner.next() -> this reads only one token

        System.out.print("Age: ");
        byte age = scanner.nextByte(); //.nextFloat for float input
        System.out.println("you are " + age);
    }
}
