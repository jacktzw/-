package test6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo01Stream_map {
    public static void main(String[] args) {
        //获取一个String类型的Stream流
        Stream<String> stream=Stream.of("1","2","3","4");
        Stream<Integer> stream2 = stream.map(t -> Integer.parseInt(t));
        //遍历Stream2流
        //stream2.forEach(t-> System.out.println(t));
        List<Integer> list = stream2.collect(Collectors.toList());
        System.out.println(list);
    }


}
