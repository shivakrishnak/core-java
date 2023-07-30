package com.ksk.java8.interview;

import java.util.List;
import java.util.stream.Collectors;

public class TreeNodeTest {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), null)), new TreeNode(3));
        //System.out.println(depthOfTree(root));

        //1357
        //2468
        int[] first = {1,3,5,7};
        int[] second = {2,4,6,8};
        int size = Math.min(first.length, second.length);
        int[] result = new int[first.length + second.length];
        int n = 0;
        int i = 0, j = 0 ;
        while (i < size) {
            if(first[i] > second[j]){
                result[n] = second[j];
                j++;
            } else {
                result[n] = first[i];
                i++;
            }
            n++;
        }
        for (int k = 0; k < result.length; k++) {
            System.out.println(result[k]);
        }

        // Square on nums
        List<Integer> nums = List.of(10,20,30,40);

        List<Integer> squaredNums = nums.parallelStream().map(val -> val * val).collect(Collectors.toList());
        System.out.println(squaredNums);

    }

    private static int depthOfTree(TreeNode root) {
        if (root == null) {
            return 1;
        }
        int left = depthOfTree(root.left);
        int right = depthOfTree(root.right);
        return 1 + Math.max(left, right);
    }
}

class TreeNode {

    // 1 --

    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
