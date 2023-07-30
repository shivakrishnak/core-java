package com.ksk.java8.interview;

import java.util.List;
import java.util.stream.Collectors;

public class Sample5 {

//    Problem Statement:You are given a list of integers. Write a Java program that uses Java 8 features to perform the following operations on the list:
//    Remove all even numbers from the list.
//    Double the value of each remaining odd number.
//    Square the value of each resulting number.
//    Find the sum of all the squared numbers.

    public static void main(String[] args) {
        List<Integer> nums = List.of(2,5);

        System.out.println(nums.stream()
                .filter(n -> n % 2 != 0)
                .map(n1 -> n1 * 2)
                .map(n2 -> n2 * n2)
                .collect(Collectors.summingInt(Integer::intValue)));
    }
}
