package test5;

import java.util.function.Predicate;

public class Demo11 {
    /**
     * 需求：判断一个字符串，有两个判断条件
     * 1.字符串的长度是否大于5
     * 2.字符串是否包含a
     * 满足一个条件即可
     */
    public static boolean checkStr(String str, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.test(str) && pre2.test(str);
        return pre1.or(pre2).test(str);
    }

    public static void main(String[] args) {
        String str = "abcd";
        boolean b=checkStr(str,  a-> a.length() > 5 ,a -> a.contains("a")

        );
        System.out.println(b);
    }

}
