package com.ksk.java8.interview;

public class Sample8 {

    public static void main(String[] args) {
        //INPUT: AAABBBCCCAAAA
        //OUTPUT: A3B3C3A4
        System.out.println(group("AAABBBCCCAAAA"));
    }

    private static String group(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int l = 0, r = 1;
        while (l < r) {
            if (str.charAt(l) == str.charAt(r)) {
                count++;
                l++;
                r++;
            }
        }
        return sb.toString();
    }
}
