package com.ksk.java8.interview;

import java.util.ArrayList;
import java.util.List;

public class Sample9 {

        //find the elements which are greater than right side 16 17 4 5 3 2
    public static void main(String[] args) {
        List<Integer> nums = List.of(16,17,4,5,3,2);
        int size = nums.size();
        List<Integer> res = new ArrayList<>();
        res.add(nums.get(size  - 1));
        for (int i = size - 2; i > 0; i--) {
            if(nums.get(i - 1) > nums.get(i)){
                res.add(nums.get(i - 1));
            }
        }
        System.out.println(res);
    }


}
