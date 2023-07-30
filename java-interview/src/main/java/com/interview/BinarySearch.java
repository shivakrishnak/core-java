package com.ksk.java8.interview;

import java.util.HashSet;
import java.util.Set;

public class BinarySearch {

    public static void main(String[] args) {
//        int[] arr = {1,4,5,7,9,12,15,18,21};
//        System.out.println(binarySearch(arr, 5));

        int[] arr = {5, 4, 6, 7, 15, 8, 17, 18, 21};
        findTargetSum(arr, 12);
    }

    private static void findTargetSumInSortedArray(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if(arr[left] + arr[right] == target){
                System.out.println(arr[left] + " - " + arr[left]);
            } else if(arr[left] + arr[right] > target){
                right--;
            } else {
                left ++;
            }
        }
    }
    private static void findTargetSum(int[] arr, int target) {
        Set cache = new HashSet();
        int size = arr.length - 1;
        for (int i = 0; i < size; i++) {
            int req = target - arr[i];
            if (cache.contains(req)) {
                System.out.println(arr[i] + " - " + req);
            } else {
                cache.add(arr[i]);
            }
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
