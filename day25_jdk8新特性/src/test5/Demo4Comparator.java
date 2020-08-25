package test5;

import java.util.Arrays;
import java.util.Comparator;

public class Demo4Comparator {
    public static Comparator<String> getComparator() {
       /* return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        };*/
       /* return (String o1, String o2) -> {
            return o2.length() - o1.length();
        };*/
       //继续优化lambda表达式
         return ( o1, o2)-> o2.length()-o1.length();

    }

    public static void main(String[] args) {
        String arr[]={"aaa","bb","cccc","ddddd"};
        System.out.println(Arrays.toString(arr));
        //Arrays.sort(arr,getComparator());
        Arrays.sort(arr,( o1, o2)-> o2.length()-o1.length());
        System.out.println(Arrays.toString(arr));

    }
}
