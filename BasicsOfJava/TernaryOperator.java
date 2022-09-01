package com.BasicsOfJava;

public class TernaryOperator {
    public static void main(String[] args) {
        int income = 120_000;
        String className = "Economy";
        if (income > 100_000){
            className = "First";
        }

        // Ternary operator

        String classWord = income > 110_000 ? "First" : "Economy";

        // if condition is true then "First" will be assigned to classWord
        // else "Economy" will be assigned to classWord
    }
}
