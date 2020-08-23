package test1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("涂志文");
        list1.add("涂志文");
        // list1.add("张文杰");
        list1.add("bb");

        list2.add("涂志文");
        list2.add("sf");
        list2.add("bb");
        list2.removeAll(list1);
        System.out.println(list2);
        File file = new File("E:\\exercise\\day8-数组\\04小组作业");
        File[] files = file.listFiles((name) -> {
            return name.isFile() && (name.toString().endsWith(".zip") || name.toString().endsWith(".rar"));
        });
        String[] list = file.list((s,p) -> {
            return s.isFile() &&( (s.toString().endsWith(".zip") || s.toString().endsWith(".rar")));
        });
        List<String> strings = Arrays.asList(list);
        System.out.println(list.length);
        Collector<Object, ?, List<Object>> objectListCollector = Collectors.toList();
        Arrays.stream(files).collect(Collectors.toList());

    }
}
