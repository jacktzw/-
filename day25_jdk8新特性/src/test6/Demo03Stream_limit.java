package test6;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo03Stream_limit {
    public static void main(String[] args) {
        /**
         * limit是一个延迟方法,只对流中的元素进行截取,返回的是一个新的流,所以可以继续调用Stream流中的其他方法
         */
        /**
         * 流式遍历
         */
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "懒羊羊", "沸羊羊");
        //Stream<String> limit = stream.limit(3);
        Stream<String> skip = stream.skip(1);
       // String[] list =  skip.toArray((s)->new String[(int)skip.count()]);
        String[] strings = skip.toArray(String[]::new);
        System.out.println(strings.length);
       /* System.out.println(Arrays.toString(list));
        System.out.println(list.length);*/
      /*  Set<String> collect = limit.collect(Collectors.toSet());
        collect.forEach(s-> System.out.println(s));*/
        //limit.forEach(s-> System.out.println(s));
    }
}
