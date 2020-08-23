import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  PACKAGE_NAME
 * @created : 2020/8/13
 * @description :
 */
public class Person {
    public  void doSomething(String s) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(s);
        System.out.println(date);
        System.out.println();

    }
    public  int login(String name,String pwd) throws Exception {
        if(!name.equals("zhangsan")&&pwd.equals("123")){
            throw new Exception();
        }
        return 1;
    }
    //原因：在return之前已经取得了n的值为3，将3放到栈顶准备返回，然后执行finally的代码块，将n赋值为4此时
    //
    public int m1(){
        int n=0;
        try {
            String s=null;
            System.out.println(s.length());
            n=2;
            return n;
        }catch (NullPointerException e){
            n=3;
            return n;
        }finally {
            n=4;
            System.out.println("关闭资源");
            //return 3;
        }
    }
    public int m(){
        try {
            String s=null;
            System.out.println(s.length());
            return 1;
        }catch (NullPointerException e){
            return 2;
        }finally {
            System.out.println("关闭资源");
            //return 3;
        }
    }

    public static void main(String[] args) {
        int m = new Person().m();
        System.out.println(m);
        System.out.println("=====");
        System.out.println(new Person().m1());
    }
}
