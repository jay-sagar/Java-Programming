package com.BasicsOfJava;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args){
        // cant do this -> NumberFormat currency = new NumberFormat() // abstract classes
        NumberFormat currency = NumberFormat.getCurrencyInstance();  // factory method
        String result = currency.format(12343453.323);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result1 = percent.format(0.1);
        System.out.println(result1);

        // or you can do like this ( Chaining method )

        String result3 = NumberFormat.getCurrencyInstance().format(93949.324);
        System.out.println(result3);

    }
}
