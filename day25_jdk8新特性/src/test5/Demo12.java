package test5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo12 {
    public static ArrayList<String> checkStr(String[] str, Predicate<String> pre1, Predicate<String> pre2){
        ArrayList<String> list=new ArrayList<>();
        for (String s : str) {
            boolean b=pre1.and(pre2).test(s);
            if(b){
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr={"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};
       List<String> list=checkStr(arr, (String s)->{
//            return s.split(",")[1].equals("女");
              return true;
        },(String s)->{
//            return s.split(",")[0].length()>3;
              return true;
        });
        System.out.println(list);
        List<String> collect = list.stream().filter(s -> s.contains("女")).collect(Collectors.toList());
        Object[] objects = collect.stream().toArray(String[]::new);
        for (Object object : objects) {
            System.out.println(((String)object).length());
        }
        System.out.println(collect);
       /* list.stream().forEach(s-> System.out.println(s));
        list.stream().forEach(System.out::println);
        System.out.println(list.stream().count());
        Map<String,String> map=new HashMap<>();
        Stream<String> stream = map.keySet().stream();
        Stream<Map.Entry<String, String>> stream1 = map.entrySet().stream();
        Stream<Map<String, String>> map1 = Stream.of(map);
*/

    }
}
