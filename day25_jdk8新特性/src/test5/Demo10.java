package test5;

import java.util.function.Predicate;

public class Demo10 {
    /**
     * 需求：判断一个字符串，有两个判断条件
     * 1.字符串的长度是否大于5
     * 2.字符串是否包含a
     */
    public static boolean checkStr(String str, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.test(str) && pre2.test(str);
        return pre1.and(pre2).test(str);
    }

    public static void main(String[] args) {
        String str = "abcd";
        boolean b=checkStr(str,
                (String a) -> {
                    return a.length() > 5;
                },
                (String a) -> {
                    return a.contains("a");
                }
        );
        System.out.println(b);
    }
}
