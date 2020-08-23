package com.qf.com.qf.exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.com.qf.exercise
 * @created : 2020/8/12
 * @description :
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");

        // 2.调用Scanner的nextLine()方法,让用户输入一个字符串
        String line = sc.nextLine();

        // 3.创建LinkedHashSet.用于去除重复的字符串,并保证迭代顺序
        LinkedHashSet<Character> chs = new LinkedHashSet<>();

        // 4.将字符串串转成char[]
        char[] charArray = line.toCharArray();

        // 5.使用增强for循环遍历每个字符
        for (char c : charArray) {
            // 6.将每个字符添加到LinkedHashSet中
            chs.add(c);
        }
        System.out.println(chs.size());

        // 7.使用增强for打印LinkedHashSet中的内容
        for (char c : chs) {
            System.out.print(c);
        }

    }
}
