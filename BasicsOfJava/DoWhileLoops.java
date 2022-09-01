package com.BasicsOfJava;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {

        // doWhileLoops will execute for once even if the condition is false

        Scanner in = new Scanner(System.in);
        String input = "";

        do {
            System.out.print("Input: ");
            input = in.next().toLowerCase();
            System.out.println(input);
        } while ( !input.equals("quit"));
    }
}
