package test7;


import java.awt.print.Printable;

public class MethodReference {
    public static void printString(printable p){
        p.print("hello");
    }
    public static void main(String[] args) {
        printString(s-> System.out.println(s));
        printString(System.out::println);
    }
}
