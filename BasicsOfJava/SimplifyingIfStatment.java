package com.BasicsOfJava;

public class SimplifyingIfStatment {
    public static void main(String[] args) {
        int income = 120_000;
        boolean hasHighIncome;
        if (income > 100_000){
            hasHighIncome = true;
        }
        else{
            hasHighIncome = false;
        }

        // simplified statement

        boolean hasHighMoney = false;
        if (income > 110_000){
            hasHighMoney = true;
        }

        // more simplified statement

        boolean hasHighSource = (income > 100_000); // parenthesis is used to make more readable

    }
}
