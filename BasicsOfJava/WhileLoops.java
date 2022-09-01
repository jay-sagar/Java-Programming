package com.BasicsOfJava;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        // use whileLoops if you don't know the situation ahead
        int i = 0;
        while ( i > 0) {
            System.out.println("Hello World" + i);
            i--;
        }

        // best example if we don't know the situation ahead
        // check user if the user entered quit or not
        Scanner in = new Scanner(System.in);
        String input = "";

        while (!input.equals("quit")) {  // .equal method is used to compares or work like == assignment
            System.out.print("Input: ");
            input = in.next().toLowerCase();
            System.out.println(input);
        }
    }
}
