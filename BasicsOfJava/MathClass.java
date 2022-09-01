package com.BasicsOfJava;

public class MathClass {
    public static void main(String[] args){
        int result = Math.round(1.1F);
        System.out.println(result);

        int result1 = (int)Math.ceil(1.1F); // largest or equal
        System.out.println(result1);

        int result2 = (int)Math.floor(1.1F); // smallest or equal
        System.out.println(result2);

        int result3 = Math.max(1, 2);
        System.out.println(result3);

        int result4 = Math.min(1, 4);
        System.out.println(result4);

        double result5 = Math.random(); // floating point no. btw 0-1
        System.out.println(result5);

        double result6 = Math.random() * 100; // floating point no. btw 0-100
        System.out.println(result6);

        int result7 = (int)Math.round(Math.random() * 100);
        System.out.println(result7);

        int result8 = (int)Math.random() * 100; // result will be zero as (int) is interacting with only random which generate no. btw 0-1
        System.out.println(result8);
        // to fix this use parenthesis

        int result9 = (int)(Math.random() * 100);
        System.out.println(result9);

        double result10 = Math.pow( 2, 4);
        System.out.println(result10);

        int x = 2;
        int y = 4;

        double result11 = Math.pow( x+1 , y);
        System.out.println(result11);

    }
}
