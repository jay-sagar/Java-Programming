package com.BasicsOfJava;

public class ForEachLoop {
    public static void main(String[] args) {

        // we use forEachLoops to iterate over arrays or collections

        String[] fruits = { "Apple", "Mango", "Orange" };


        for ( int i = 0; i < fruits.length; i++ ){
            System.out.println(fruits[i]);
        }
        // for loop have both the access of index and the actual item

        for ( int j = fruits.length -1; j >= 0 ; j-- ){
            System.out.println(fruits[j]);
        }
        // for Each Loop ( variable should be based on the types of items in our array )
        for (String fruit : fruits){
            System.out.println(fruit);
        }
        // Limitation of forEachLoop:
        // 1. it's always forward only so we can can't iterate over this array from end
        // 2. we don't have the access to the index of each item
    }
}
