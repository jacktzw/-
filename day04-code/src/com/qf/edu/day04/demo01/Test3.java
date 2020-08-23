package com.qf.edu.day04.demo01;

import java.util.Arrays;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.edu.day04.demo01
 * @created : 2020/8/2
 * @description :
 */
public class Test3 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,9,3,1,4,5};
        System.out.println(removeElement1(nums,2));
        System.out.println(Arrays.toString(nums));
    }
    public static int removeElement(int[] nums, int val) {
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val){
                continue;
            }
            nums[index]=nums[i];
            index++;
        }
        return index;
    }
    public static int removeElement1(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

}
