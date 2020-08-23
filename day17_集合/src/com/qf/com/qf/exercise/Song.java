package com.qf.com.qf.exercise;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.com.qf.exercise
 * @created : 2020/8/11
 * @description :
 */
public class Song implements Comparable<Song>{
    private int id;
    private String name;
    private String singername;
    private int longs;

    public Song(String name, String singername, int longs) {
        this.name = name;
        this.singername = singername;
        this.longs = longs;
    }

    public Song() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingername() {
        return singername;
    }

    public void setSingername(String singername) {
        this.singername = singername;
    }

    public int getLongs() {
        return longs;
    }

    public void setLongs(int longs) {
        this.longs = longs;
    }

    public String play() {
        return id+"."+getSingername()+"---"+getName()+"---"+getLongs();
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", singername='" + singername + '\'' +
                ", longs=" + longs +
                '}';
    }

    @Override
    public int compareTo(Song song) {
        if(song !=null){
            if(this.getLongs()>song.getLongs()){
                return 1;
            }else if(this.getLongs()<song.getLongs()){
                return -1;
            }else{
                return 0;
            }
        }
        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
