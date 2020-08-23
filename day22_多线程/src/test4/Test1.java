package test4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test1 {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("苹果");
        queue.offer("橘子");
        queue.offer("葡萄");
        queue.offer("西瓜");
        queue.offer("芒果");

        System.out.println(queue.size());
        int size=queue.size();
        for (int i = 0; i < 5; i++) {
            System.out.println(queue.poll());
        }

        System.out.println(queue.size());
    }
}
