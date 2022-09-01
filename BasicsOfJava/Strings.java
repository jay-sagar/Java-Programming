package com.BasicsOfJava;

public class Strings {
    public static void main(String[] args){
        String message = "  Hello World" + "!! "; // reference type

        System.out.println(message.endsWith("!!")); //return boolean value
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("W"));
        System.out.println(message.indexOf("sky"));// -1 means no it doesn't have one
        System.out.println(message.replace("!", "*")); //doesn't modify the string
        // In JAVA strings are immutable
        System.out.println(message.toLowerCase());
        System.out.println(message.trim()); // remove the blank spaces from front and back


    }
}
