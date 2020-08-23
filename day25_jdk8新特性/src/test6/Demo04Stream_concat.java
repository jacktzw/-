package test6;

import java.util.stream.Stream;

public class Demo04Stream_concat {
    public static void main(String[] args) {
        /**
         * concat将两个流合并成一个流
         *
         */
        Stream<String> stream = Stream.of("张三");
        Stream<String> stream1 = Stream.of("李四");
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(s-> System.out.println(s));
    }
}
