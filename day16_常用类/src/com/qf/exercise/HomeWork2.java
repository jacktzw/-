package com.qf.exercise;

import java.util.Arrays;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.exercise
 * @created : 2020/8/10
 * @description :
 */
public class HomeWork2 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        System.out.println("请输入一个字符串:");
        String text = HomeWork1.sc.nextLine();
        String[] s = text.split(" ");
        String g = null;
        for (int i = 0; i < s.length; i++) {
            char ch = s[i].charAt(0);
            //判断第一位是否为小写
            if ((ch - 'a' | 'z' - ch) > 0) {
                g = s[i].replaceFirst(ch + "", (char) (ch - 32) + "");
                sb.append(g);
            } else {
                //如果第一位已经为大写则不转化
                sb.append(s[i]);
            }
        }
        System.out.println(sb);

    }

}
