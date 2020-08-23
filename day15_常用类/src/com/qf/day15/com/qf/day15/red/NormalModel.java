package com.qf.day15.com.qf.day15.red;
import java.util.ArrayList;
import java.util.List;


/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.red
 * @created : 2020/8/8
 * @description :
 */
public class NormalModel implements OpenMode {
    @Override
    public List<Integer> divide(final int totalMoney,final int totalCount) {
        List<Integer> list=new ArrayList<>();//平均值
        int avg=totalMoney/totalCount;//取余
        int mod=totalMoney%totalCount;//求模
        for (int i = 0; i < totalCount-1; i++) {
            list.add(avg);
        }
        list.add(avg+mod); //群主为最后一个红包
        return list;
    }
}
