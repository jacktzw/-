/**
 * @author : 14118
 * @version : V1.0
 * @packageName :  PACKAGE_NAME
 * @created : 2020/8/13
 * @description :
 */
public class Test {
    public static void main(String[] args) {
      StringBuffer sb=  new StringBuffer("helloworld");

        System.out.println(sb.length());
        System.out.println(sb.capacity());
        try {
            String s="545";
            System.out.println(s.length());
            int i=5/0;
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }



    }
}
