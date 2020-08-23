package test9;

/**
 * 数组的构造器引用
 */
public class Demo {

    /**
     * 定义一个方法
     * @param args 方法传递创建数组的长度和ArrayBuilder接口
     */
    public static int[] createArray(int length,ArrayBuilder builder){
        return builder.builderArray(length);
    }
    public static void main(String[] args) {
        int[] array = createArray(10, (s) -> {
            return new int[s];
        });
        /**
         * 使用方法引用优化lambda表达式
         */
        int[] array2 = createArray(10, int[]::new);
        System.out.println(array.length);
        System.out.println(array2.length);
    }
}
