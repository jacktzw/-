package test4;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        /**
         * 1. 如何获取集合的Stream流
         *   集合.Stream()
         *   Stream.of(数组)
         *  2.Stream流的过滤方法
         *  filter()过滤
         */
        ArrayList<String> list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("张三三");
        list.add("赵六");
        list.add("张一一");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        Stream<String> stream1 = stream.filter(s -> s.contains("张"));
        stream1. forEach(System.out::println);
        //Stream<String> stream2=stream1.filter(s->s.length()==3);
        //stream2.forEach(t-> System.out.println(t));
        /***
         * lambada表达式
         * (参数)->{代码}
         * 1.如果参数只有一个()是可以省略的
         * 2.{}是可以省略的。不能有;
         */
    }
}
