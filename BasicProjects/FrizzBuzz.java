package com.BasicProjects;

import java.util.Scanner;

public class FrizzBuzz {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Number: ");
        int number = in.nextInt();

        // most specific condition on the top & most generic ones on the bottom

        if (number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0){
            System.out.println("Fizz");
        }
        else if (number % 3 ==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(number);
        }
    }

}
