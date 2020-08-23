package test8;

/**
 * 通过对象名引用成员方法
 * 使用前提是对象名已经存在的，成员方法也是存在的
 * 就可以使用对象名来引用成员方法
 */
public class Demo01 {
    public static void printString(Printable p){
        p.print("hello");
    }
    public static void main(String[] args) {
        printString((s)->{
            //创建MethodObject对象
            MethodRerObject obj=new MethodRerObject();
            obj.printUpperCaseString(s);
        });
        /**
         * 使用方法引用优化lambda
         */
        MethodRerObject obj=new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
}
