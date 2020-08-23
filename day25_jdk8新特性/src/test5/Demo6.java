package test5;

import java.util.function.Consumer;

public class Demo6 {
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        //消费式接口
        method("李易峰",(String name)->{
            System.out.println(name);
            System.out.println(name.length());
            String rename = new StringBuffer(name).reverse().toString();
            System.out.println(rename);
        });
    }
}
