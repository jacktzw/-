package test5;

import java.util.function.Supplier;

public class Demo5 {
    public static int getMax(Supplier<Integer> sup){
        return  sup.get();
    }

    public static void main(String[] args) {
        int[] arr={88,6,-80,-6,77,999};
        //使用lambda表达式、函数式接口
        int maxValue=getMax(()->{
            int max=arr[0];
            for (int i : arr) {
                if(i>max){
                    max=i;
                }
            }
            return max;
        });
        System.out.println("最大值为:"+maxValue);
    }
}
