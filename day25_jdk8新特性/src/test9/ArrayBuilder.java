package test9;

@FunctionalInterface
public interface ArrayBuilder {
    //定义创建一个int类型数组的方法，参数传递数组的长度，返回创建好的数组
    int[] builderArray(int length);

}
