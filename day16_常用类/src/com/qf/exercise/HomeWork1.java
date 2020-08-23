package com.qf.exercise;

import java.util.Scanner;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.exercise
 * @created : 2020/8/10
 * @description :
 */
public class HomeWork1 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("请输入你的邮箱"); //1411840699@qq.com
            String email=sc.nextLine();
            System.out.println("请输入你的密码");
            String pwd=sc.nextLine();
            if(pwd.isEmpty()||email.isEmpty()){
                System.out.println("邮箱或者密码为空请重新输入!");
            }else if(pwd.length()<6){
                System.out.println("密码不能少于6位");
            }else if(email.indexOf("@")>email.indexOf(".")){
                System.out.println("@符号应该在.之前");
            }else if(email.equals("zhangsan@163.com")&&pwd.equals("666666")){
                System.out.println("欢迎,"+email.substring(0,email.indexOf("@")));
                System.out.println("登录成功！！！！");
                break;
            }else{
                System.out.println("登录失败请重新登录");
            }

        }
        sc.close();
    }
}
