package com.qf.day16;

import com.qf.exercise.HomeWork1;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day16
 * @created : 2020/8/11
 * @description :
 */
public class MyDemo9 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        System.out.println("请输入一个字符串:");
        String text = HomeWork1.sc.nextLine();
        String[] s = text.split(" ");
        String g = null;
        for (int i = 0; i < s.length; i++) {
            if(s[i]!=null){
                String l = s[i].substring(0, 1).toUpperCase();
                sb.append(l);
                sb.append(s[i].substring(1));
            }
//            String re = s[i].replaceFirst(s[i].substring(0,1), s[i].substring(0,1).toUpperCase());
//            sb.append(re);
        }
        System.out.println(sb);


    }
}
