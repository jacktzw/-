package com.qf.day15.com.qf.day15.demo8;

import com.qf.day15.com.qf.day15.red.RedPacketFrame;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.demo8
 * @created : 2020/8/8
 * @description :
 */
public class MyRed extends RedPacketFrame {
    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public MyRed(String title) {
        super(title);
    }
}
