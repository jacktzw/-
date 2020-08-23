package com.qf.edu.day04.demo01;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.edu.day04.demo01
 * @created : 2020/8/2
 * @description :
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr={5,2,4,1,3,6,0};
        int num=thirdMax(arr);
        System.out.println(num);
    }
    public static int thirdMax(int[] nums) {
        int one=nums[0];
        long two=Long.MIN_VALUE;
        long three=Long.MIN_VALUE;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]==one||nums[i]==two||nums[i]==three) {
                continue;
            }
            if(nums[i]>one){
                three=two;
                two=one;
                one=nums[i];
            }else if(nums[i]>two){
                three=two;
                two=nums[i];
            }else if(nums[i]>three){
                three=nums[i];
            }
        }
        if(three==Long.MIN_VALUE) {
            return one;
        }

        return  (int)three;
    }

}
