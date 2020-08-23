package com.qf.day18;


import java.util.*;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day18
 * @created : 2020/8/12
 * @description :
 */
public class MyDemo {
    public static void main(String[] args) {
        HashMap<Song,String> hashMap=new HashMap<>();
        String s1= hashMap.put(new Song("点歌的人","海棠阿木",400),"1");
        String s2= hashMap.put(new Song("123","海棠阿木",200),"2");
        String s3= hashMap.put(new Song("432","海棠阿木",300),"3");
        System.out.println(hashMap.size());
        List list=new ArrayList();
        list.add(hashMap);
        System.out.println(list);
        System.out.println(list.size());
        for (Object o : list) {
            HashMap<Song,String> map= (HashMap<Song, String>) o;
            Set<Song> songs = map.keySet();
            System.out.println(songs);
        }
        //System.out.println(hashMap);
       /* System.out.println("-------");
        Set<Map.Entry<Song, String>> set = hashMap.entrySet();
        for (Map.Entry<Song, String> entry : set) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
        System.out.println("***********************");
        System.out.println("1"=="1");
        Set<Map.Entry<Song, String>> entries = hashMap.entrySet();
        Iterator<Map.Entry<Song, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<Song, String> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
            System.out.println("------------"+next.getKey());
            if(next.getValue().equals("1")){
                iterator.remove();
            }

        }
        System.out.println(set);*/

     /*   hashMap.keySet();
        System.out.println("s1"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);

        System.out.println("=======================================");
        TreeMap<Song,String> hashMap1=new TreeMap<>();
        String s4= hashMap1.put(new Song("点歌的人","海棠阿木",200),"1");
        String s5= hashMap1.put(new Song("123","海棠阿木",300),"2");
        String s6= hashMap1.put(new Song("432","海棠阿木",100),"3");
        System.out.println(hashMap1.size());
        //System.out.println(hashMap1);
        System.out.println("-------");
        Set<Map.Entry<Song, String>> set1 = hashMap1.entrySet();
        for (Map.Entry<Song, String> entry : set1) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
        hashMap1.keySet();
        System.out.println("s4"+s1);
        System.out.println("s5:"+s2);
        System.out.println("s6:"+s3);
        System.out.println("*********************************");
        LinkedHashMap<Song,String> hashMap2=new LinkedHashMap<>();
        String s7= hashMap2.put(new Song("点歌的人","海棠阿木",400),"1");
        String s8= hashMap2.put(new Song("123","海棠阿木",200),"2");
        String s9= hashMap2.put(new Song("432","海棠阿木",300),"3");
        System.out.println(hashMap2.size());
        //System.out.println(hashMap2);
        System.out.println("-------");
        Set<Map.Entry<Song, String>> set2 = hashMap2.entrySet();
        for (Map.Entry<Song, String> entry : set2) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
        hashMap2.keySet();
        System.out.println("s7"+s1);
        System.out.println("s8:"+s2);
        System.out.println("s9:"+s3);*/



    }

    }


