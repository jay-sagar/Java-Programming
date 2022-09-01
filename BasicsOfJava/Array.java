package com.BasicsOfJava;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        // array - reference type
        int[] numbers = new int[5]; // no. of size
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));

        // above syntax is older one

        int[] values = {2, 9, 5, 1, 8};
        System.out.println(values.length);
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
    }
}
