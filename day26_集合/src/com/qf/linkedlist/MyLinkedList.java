package com.qf.linkedlist;

public class MyLinkedList {
    private Node first;
    private Node last;
    private int size;
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add("a");
        myLinkedList.add("b");
        System.out.println(myLinkedList.size());
    }

    public void add(Object obj) {
        Node node=new Node();
        if(first==null){
            node.setPrevious(null);
            node.setObj(obj);
            node.setNext(null);
            first=node;
            last=node;
        }else{
            node.setObj(obj);
            node.setPrevious(last);
            node.setNext(null);
            last.setNext(node);
            last=node;

        }
        size++;
    }
    public  int size(){
        return size;
    }
}
