package test5;

/**
 * 日志案例
 */
public class Demo1 {
    public static void main(String[] args) {
        String msg1="hello";
        String msg2="world";
        String msg3="java";
        showLog(1,msg1+msg2+msg3);
    }
    public static void showLog(int level,String msg){
        if(level==1){
            System.out.println(msg);
        }
    }
}
