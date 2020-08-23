package test3;

public class Demo1 {
    public static void main(String[] args) {
        /**
         * jak8.0新特性:lambda表达式
         * lambada表达式代表了jdk的一种进步。
         * 引入了一种思想，函数式编程思想。函数式思想表达的核心理念是：拿什么东西做什么事
         * 使用前提: lambda必须是接口，必须保证当前接口只有一个抽象方法
         */
      /*  new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start..........");
            }
        }).start();*/
       /*demo(new Cal() {
           @Override
           public void add(int a, int b) {
               System.out.println("结果为:"+(a+b));
           }
       });*/
        new Thread(()->{
            System.out.println("我是lambada表达式.....");
        });
        demo((a,b)->{
           System.out.println("结果为:"+(a+b));
       });

    }
    public static void demo(Cal c){
        c.add(20,30);
        System.out.println("hhhhh");
    }
}
