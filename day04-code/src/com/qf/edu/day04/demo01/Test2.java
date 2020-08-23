package com.qf.edu.day04.demo01;

import java.util.Arrays;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.edu.day04.demo01
 * @created : 2020/8/2
 * @description :
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr={ 0,0,1,2,3,4,4};
        int[] newArr=Arrays.copyOf(arr,removeDuplicates(arr));
        System.out.println(Arrays.toString(newArr));
    }
    public static int removeDuplicates(int[] nums) {
        int index=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=nums[index]){
                index++;
                nums[index]=nums[i];
            }
        }
        return index+1;
    }
}
