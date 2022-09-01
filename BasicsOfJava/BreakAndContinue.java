package com.BasicsOfJava;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = "";

            while (true){  // ->(!input.equals("quit"))

            // use true as our loop condition ( make sure break statement in your loop )
            // (true) -> loop will be executed forever until the condition is satisfied

            System.out.print("Input: ");
            input = in.nextLine().toLowerCase();
            if(input.equals("pass")){
                continue;  // doesn't print and goes back to the loop
            }
            if(input.equals("quit")){
                break;     // terminate the whole program
            }
            System.out.println(input);
        }
    }
}
