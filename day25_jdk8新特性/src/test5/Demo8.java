package test5;

import java.util.function.Consumer;

public class Demo8 {
    public static void printInfo(String[] arr, Consumer<String> con1,Consumer<String> con2){
        for (String s : arr) {
            //使用andThen方法连接两个Consumer接口，消费字符串
            con1.andThen(con2).accept(s);
        }

    }

    public static void main(String[] args) {
        String[] arr={"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};
        printInfo(arr,
                (msg)->{
                    String name=msg.split(",")[0];
                    System.out.print("姓名:"+name);
                },
                (msg)->{
                    String age=msg.split(",")[1];
                    System.out.println("。年龄:"+age+"。");
                }
                );
    }
}
