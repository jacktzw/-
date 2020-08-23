package com.qf.com.qf.exercise;

import java.util.*;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.com.qf.exercise
 * @created : 2020/8/11
 * @description :
 */
public class HomeWork1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        /*
         *作业：
        定义歌类，属性：歌名、歌手名、播放时长（int 类型）,定义play方法显示歌信息。
        1、添加10首歌到ArrayList集合中
        2、遍历所有的歌，调用play方法显示歌信息
        3、输入歌名，在集合中查找该歌
        4、输入整数索引，删除该位置的歌
        5、找出播放时间最长的歌
        6、将所有歌复制到LinkedList集合中
        7、将所有的歌根据播放时长排序，并显示
         */
        List<Song> songs =new ArrayList<Song>(Arrays.asList(
                new Song("稻香", "周杰伦", 140),
                new Song("惊雷", "周杰伦", 130),
                new Song("下山", "周杰伦", 131),
                new Song("我和你", "周杰伦", 119),
                new Song("夏天", "周杰伦", 219),
                new Song("飞鸟和蝉", "周杰伦", 134),
                new Song("光点", "周杰伦", 1333),
                new Song("青花瓷", "周杰伦", 444),
                new Song("芒种", "周杰伦", 99),
                new Song("芒种", "周杰伦", 999)
        ));
        for (int i = 0; i < songs.size(); i++) {
            songs.get(i).setId(i+1);
        }
        System.out.println(songs.size());
        for (Song song : songs) {
            System.out.println(song.play());
        }
        System.out.println("请输入你要查找的歌名:");
        String name = sc.nextLine();
        for (Song song : songs) {
            if(name.equals(song.getName())){
                System.out.println(song.play());
                break;
            }
        }
        System.out.println("请输入你要删除元素的索引：");
        int re=sc.nextInt();
        if(re>=0&&re<songs.size()-1){
            songs.remove(re);
        }else{
            System.out.println("你输入的索引不存在");
        }
        for (Song song : songs) {
            System.out.println(song.play());
        }
        int max=songs.get(0).getLongs();
        int index=0;
        for (int i = 1; i < songs.size(); i++) {
            if(songs.get(i).getLongs()>max){
                max=songs.get(i).getLongs();
                index=i;
            }
        }
        System.out.println("播放时间最长的歌为:"+ songs.get(index).play());
        LinkedList linkedList=new LinkedList();
        linkedList.addAll(songs);
        /*for (int i = 0; i <songs.size() ; i++) {
            linkedList.add(songs.get(i));
        }*/
        //System.out.println(linkedList);
        System.out.println(linkedList);
        Collections.sort(linkedList);
        for (Object o : linkedList) {
            System.out.println(o);
        }
       /* for (Song song : songs) {
            System.out.println(song.play());
        }*/
       


    }
}
