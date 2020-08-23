package test5;

import java.util.function.Consumer;

public class Demo7 {
    //连接两个Consumer接口进行消费
    public static void method(String name, Consumer<String>con1,Consumer<String>con2){
        /*con1.accept(name);
        con2.accept(name);*/
        Consumer<String> stringConsumer = con1.andThen(con2);
        stringConsumer.accept(name);
    }

    public static void main(String[] args) {
        method("Hello",
                (name)->{
                    System.out.println(name.toUpperCase());
                },
                (name)->{
                    System.out.println(name.toLowerCase());
                }
                );
    }
}
