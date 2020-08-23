package com.qf.demo3;

import static com.qf.demo3.Contains.ZHUO_SHAO;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.demo3
 * @created : 2020/8/14
 * @description :
 */
public class Test {
    public static void main(String[] args) {
        setStatus(PersonStatus.BINGDONG);
        PersonStatus[] values = PersonStatus.values();
        for (PersonStatus value : values) {
            System.out.println(value);
        }
        System.out.println(PersonStatus.ZHUO_SHAO.ordinal());
        System.out.println(PersonStatus.BINGDONG.ordinal());
        System.out.println(PersonStatus.valueOf(PersonStatus.class,"BINGDON"));
    }

    public static void setStatus(PersonStatus personStatus) {
        switch (personStatus) {
            case ZHUO_SHAO:
                System.out.println(PersonStatus.ZHUO_SHAO.detail());
                break;
            case BINGDONG:
                System.out.println(PersonStatus.BINGDONG.detail());
                break;
            case ZHONGDU:
                System.out.println(PersonStatus.ZHONGDU.detail());
                break;
        }

    }
}
