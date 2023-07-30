package com.ksk.java8.interview;

public class Sample13 {

    static int count = 0;

    public static void main(String[] args) {
        //String input = "You are at the right place"
        //
        //o/p-> "place right the at are You"
        //find non-repeated char
        String input = "you are at the right place";
        String[] chars = input.split("");
        countOccurrence(chars, 0);
        System.out.println("Count :: " + count);
    }

    private static void countOccurrence(String[] input, int index) {
        if(index >= input.length){
            return;
        }
        if("t".equals(input[index])){
            count++;
        }
        index++;
        countOccurrence(input, index);
    }
}
