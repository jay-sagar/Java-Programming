package com.BasicsOfJava;

public class ArithExpression {
    public static void main(String[] args){
        // wrong -> int result = 10/3;
        double result = (double)10 / (double)3;
        System.out.println(result);

        int x =1;
        x++;
        ++x;
        System.out.println(x);

        int y = 1;
        int z = y++; // first value of y will be stored in z and then increment
        int w = ++y; // first increment of value of y and then it will be stored in w
        System.out.println(z);
        System.out.println(w);

        x = x + 2;
        x += 2;
        System.out.println(x);
    }
}
