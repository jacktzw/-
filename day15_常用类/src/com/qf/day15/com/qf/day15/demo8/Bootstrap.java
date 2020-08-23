package com.qf.day15.com.qf.day15.demo8;

import com.qf.day15.com.qf.day15.red.NormalModel;
import com.qf.day15.com.qf.day15.red.OpenMode;
import com.qf.day15.com.qf.day15.red.RandomModel;
import com.qf.day15.com.qf.day15.red.RedPacketFrame;

import java.util.Random;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.demo8
 * @created : 2020/8/8
 * @description :
 */
public class Bootstrap {
    public static void main(String[] args) {
        RedPacketFrame red=new MyRed("发红包") ;
        red.setOwnerName("王多鱼");
        //普通红包
        OpenMode normal=new NormalModel();
        red.setOpenWay(normal);
        //随机红包
        OpenMode random=new RandomModel();
        red.setOpenWay(random);
    }
}
