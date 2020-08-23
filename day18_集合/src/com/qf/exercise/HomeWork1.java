package com.qf.exercise;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.exercise
 * @created : 2020/8/12
 * @description :
 */
public class HomeWork1 {
    public static void main(String[] args) {
        Map<String ,Song> map=new HashMap<>();//歌曲名为键，歌曲
        map.put("稻香", new Song("1.稻香", "周杰伦", 122));
        map.put("惊雷", new Song("2.惊雷", "周杰伦", 111));
        map.put("下山", new Song("3.下山", "周杰伦", 88));
        map.put("我和你", new Song("4.我和你", "周杰伦", 66));
        map.put("夏天", new Song("5.夏天", "周杰伦", 56));
        map.put("飞鸟和蝉", new Song("6.飞鸟和蝉", "周杰伦", 333));
        map.put("光点", new Song("7.光点", "周杰伦", 22));
        map.put("青花瓷", new Song("8.青花瓷", "周杰伦", 687));
        map.put("芒种", new Song("9.芒种", "周杰伦", 434));
        map.put("朋友", new Song("1.稻香", "童颜", 232));
        Set<String> keys = map.keySet();
        Collection<Song> values = map.values();
        for (Song value : values) {
            System.out.println(value);
        }
        System.out.println("-------------");
        // 2.遍历所有的歌曲，显示歌曲信息
        for (String name : keys) {
            System.out.println(name+"---"+map.get(name).play());
        }
        // 3.输入歌曲名，显示歌曲信息
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查找的歌曲:");
        String name=sc.nextLine();
        if(map.containsKey(name)){
            System.out.println(map.get(name).play());
        }
        //4、输入歌曲名，删除歌曲
        System.out.println("请输入要删除的元素");
        String name1=sc.nextLine();
        if(map.containsKey(name1)){
            map.remove(name1);
        }
        for (Map.Entry<String,Song> entry:map.entrySet()) {
            System.out.println(entry.getValue().play());
        }
        //5、将所有的歌曲放入TreeMap，按照时长进行排序并显示排序结果
        TreeMap<Song,String> treeMap=new TreeMap<>();
        for (Map.Entry<String,Song> entry:map.entrySet()) {
            treeMap.put(entry.getValue(),entry.getKey());
        }
        System.out.println("排序后的歌曲名字:");
        for (Map.Entry<Song,String> entry:treeMap.entrySet()) {
            System.out.println(entry.getKey().play());
        }
        //6、创建HashSet，添加10首歌（部分歌曲名称相同）到集合中，根据歌曲名称进行去重并显示
        Set<Song> songs = treeMap.keySet();
        Set<Song> set=new HashSet();
        set.addAll(songs);
        System.out.println("去重后的歌曲名为:");
        for (Song song : set) {
            System.out.println(song.play());
        }
        //7、将歌曲放入到TreeSet中，按照时长进行排序
        System.out.println("========================");
        TreeSet<Song> treeSet=new TreeSet<>(songs);
        //treeSet.addAll(songs);
        treeSet.add( new Song("1.稻香", "童颜", 20));
        treeSet.add( new Song("19.稻香77", "童颜", 434));
        for (Song song : treeSet) {
            System.out.println(song.play());
        }

    }
}
