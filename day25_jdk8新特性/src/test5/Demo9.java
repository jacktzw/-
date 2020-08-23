package test5;

import java.util.function.Predicate;

/**
 * Predicate接口，对某种数据类型的判断
 * test用来判断的方法
 * Predicate接口中有一个
 * boolean test(T t):用来对指定数据判断的方法
 * 结果:符合条件 true
 *      不符合条件false
 */
public class Demo9 {
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s="你好吗aaaa?";
       /* boolean b= checkString(s,( p)->{
           return p.length()>5;
        });*/
        boolean b= checkString(s,p->p.length()>5);
        System.out.println(b);
    }
}
