package com.qf;

import java.util.LinkedList;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf
 * @created : 2020/8/11
 * @description :
 */
public class LinkedListMydemo {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("hello");
        //linkedList.addFirst("134");
        linkedList.addLast("world");
        linkedList.getFirst();
        linkedList.getLast();
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        linkedList.remove(1);
        System.out.println(linkedList.peekLast());
        //为什么java是伪泛型 java的泛型只是编译前的代码检查，以及赋值的改变， 在实际运行时并没有用到泛型
    }
}
