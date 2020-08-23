package test5;

/**
 * 使用优化的lambda日志案例
 * lambda的特点:延迟加载
 * lamdbda的使用前提：必须存在函数式接口
 */
public class Demo2 {
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        showLog(1, () -> {
            return msg1 + msg2 + msg3;
        });
    }

    public static void showLog(int level, MessageBuilder mb) {
        if (level == 1) {
            System.out.println("不满足条件不执行....");
            System.out.println(mb.builderMessage());
        }
    }
}
