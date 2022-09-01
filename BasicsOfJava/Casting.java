package com.BasicsOfJava;

public class Casting {
    public static void main(String[] args){
        // Implicit casting -> conversion happens automatically
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double a  = 1.1;
        double b = a + 2; // 2.0
        System.out.println(b);

        // Explicit casting
        double c = 1.2;
        int d = (int)c + 2; // converted the double into integer
        System.out.println(d);

        String w = "12";
        int z = Integer.parseInt(w) + 2;
        System.out.println(z);

        String f = "1.2";
        double g = Double.parseDouble(f) + 2;
        System.out.println(g);


    }
}
