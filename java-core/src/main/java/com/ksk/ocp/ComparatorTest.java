package com.ksk.ocp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        String[] str = {"bang", "oman", "bong","ping"};
        Comparator<String> c = (String a1,String a2) -> a2.compareTo(a1);
        Arrays.sort(str,c);
        System.out.println(Arrays.binarySearch(str, "oman", c));
        Arrays.asList(str).stream().filter(x -> x == x).parallel().filter(x -> x == x).parallel();

        List ll = List.of("bang", "oman", "bong","ping");

        System.out.println(Arrays.asList(str).equals(ll));
    }
}
