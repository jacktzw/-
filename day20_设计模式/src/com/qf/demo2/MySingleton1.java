package com.qf.demo2;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.demo2
 * @created : 2020/8/14
 * @description :
 */
public class MySingleton1 {
    String name;
    private static MySingleton1 mySingleton1=null;
    private MySingleton1(){

    }
    public  static synchronized MySingleton1 getMysigleton1(){
        if(mySingleton1==null){
            mySingleton1=new MySingleton1();
        }
            return mySingleton1;


    }
}
