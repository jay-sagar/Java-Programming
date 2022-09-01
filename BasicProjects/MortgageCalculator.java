package com.BasicProjects;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner in = new Scanner(System.in); // in -> input

        int principal;
        float interest_rate;
        byte period;


        while ( true ) {
            System.out.print("Principal ($1k - $1M): ");
            principal = in.nextInt();

            if ( principal >= 1_000 && principal <= 1_000_000){
                break;
            }
            System.out.println("Enter the value between 1000 and 1000000.");
        }

        while ( true ) {
            System.out.print("Annual interest rate: ");
            interest_rate = in.nextFloat(); // in percentage

            if (interest_rate > 0 && interest_rate <= 30) {
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }

        while ( true ) {
            System.out.print("Period (Years): ");
            period = in.nextByte(); // in years

            if ( period >= 1 && period <= 30){
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        float interest_month = interest_rate / PERCENT / MONTHS_IN_YEAR;

        int period_month = period * MONTHS_IN_YEAR;

        double mortgage1 = interest_month * Math.pow( interest_month +1 , period_month);
        double mortgage2 = Math.pow( interest_month + 1 , period_month) - 1;
        double mortgage = principal * ( mortgage1 / mortgage2 );

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted);


    }
}
