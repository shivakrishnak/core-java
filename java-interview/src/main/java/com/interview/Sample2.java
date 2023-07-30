package com.ksk.java8.interview;

public class Sample2 {
    // 0 + 1 =1
    // 1 + 1 = 2
    // 2 + 1 = 3;
    // 3 + 2  = 5
    //find nth fibonacci number, given series : 1 1 2 3 5 8 13 ... (for n=3, return 2; for n=6, return 8)

    public static void main(String[] args) {
        //System.out.println(findFibonacci(3));

        //given a string s, reverse each word in string. eg. Apple is a healthy fruit -> elppA si a yhtlaeh tiurf

        String str = "Apple is a healthy fruit";
        int len = str.length() - 1;
        String[] words = str.split(" ");


        char[] chars = new char[len + 2];
        int n = 0;
        for (String word : words) {
            for (int i = word.length() -1; i >= 0; i--) {
                chars[n++] = word.charAt(i);
            }
            chars[n++] = ' ';
        }
        System.out.println(String.valueOf(chars));
    }

    private static int findFibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
