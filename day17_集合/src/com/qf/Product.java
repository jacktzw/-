package com.qf;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf
 * @created : 2020/8/11
 * @description :
 */
public class Product implements Comparable<Product>{
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Product p) {
        if(p!=null){
            if(this.id>p.id){
                return 1;
            }else if(this.id<p.id){
                return -1;
            }else{
                return 0;
            }
        }
        return 0;
    }
}
