package com.qf.day15.com.qf.day15.red;

import java.util.ArrayList;
import java.util.List;

public interface OpenMode {
    /**
     * 请将totalMoney分成count份，保存到ArrayList<Integer>中，返回即可。
     *
     * @param totalMoney            总金额为方便计算，已经转换为整数，单位为分。
     * @param totalCount            红包个数
     * @return ArrayList<Integer>	元素为各个红包的金额值，所有元素的值累和等于总金额。
     */
    List<Integer> divide(int totalMoney, int totalCount);
}