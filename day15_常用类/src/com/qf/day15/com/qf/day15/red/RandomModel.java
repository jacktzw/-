package com.qf.day15.com.qf.day15.red;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.red
 * @created : 2020/8/8
 * @description :
 */
public class RandomModel implements OpenMode {
       private  static Random random=new Random();
    @Override
    public List<Integer> divide(int totalMoney, int totalCount) {
        //随机红包
        List<Integer> list=new ArrayList<>();
        int leftMoney=totalMoney;//红包最小单位为分
        int leftCount=totalCount;
        for (int i = 0; i < totalCount-1; i++) {
            int money=random.nextInt(leftMoney/leftCount*2)+1;
            list.add(money);
            leftMoney-=money;
            leftCount--;
        }
        list.add(leftMoney);
        return list;
    }
}
