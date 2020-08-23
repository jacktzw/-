package com.qf.day18;

import java.util.Objects;

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
                "id=" + id +
                ", name='" + name + '\'' +
                ", singername='" + singername + '\'' +
                ", longs=" + longs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(name, song.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Song o) {
        return o.longs-this.longs;
    }
}
