package com.ksk.java8.interview;

import java.util.*;

public class Sample12 {
    public static void main(String[] args) {

        //input int array
        //output duplicate elements

        int[] nums = {1,2,1,7,3,6,3,2,3};
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if(unique.contains(nums[i])){
                duplicate.add(nums[i]);
            } else {
                unique.add(nums[i]);
            }
        }
        System.out.println(duplicate);

    }
}
