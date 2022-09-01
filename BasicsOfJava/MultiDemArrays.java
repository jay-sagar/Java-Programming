package com.BasicsOfJava;

import java.util.Arrays;

public class MultiDemArrays {
    public static void main(String[] args){
        // old syntax for already known numbers
        int[][] numbers = new int[2][3]; // 2 rows 3 columns
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        // new syntax

        int[][] values = {{ 1, 2, 4}, { 4, 6, 8}};
        System.out.println(Arrays.deepToString(values));
    }
}
