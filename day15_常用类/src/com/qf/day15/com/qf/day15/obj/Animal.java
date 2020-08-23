package com.qf.day15.com.qf.day15.obj;

import java.util.Objects;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  com.qf.day15.com.qf.day15.obj
 * @created : 2020/8/7
 * @description :
 */
public class Animal {
    private String name="张三";
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
    //    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name + '\'' +
//                '}';
//    }


  /*  @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(obj==this){
            return true;
        }
        if(obj instanceof  Animal){
             Animal a= (Animal) obj;
             if(a.id==null){
                 return false;
             }else {
                 if(a.id.equals(this.id)){
                     return true;
                 }else{
                     return false;
                 }
             }
        }
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(id, animal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
