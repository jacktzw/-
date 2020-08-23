import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
       /* BreadCon con=new BreadCon();
        Product product=new Product(con);
        Comsumer comsumer=new Comsumer(con);
        Thread t1=new Thread(product,"老板");
        Thread t2=new Thread(comsumer,"小明");
        t1.start();
        t2.start();*/
        String name="阿拉丁";
        System.out.println(name.indexOf("拉丁"));
        File file=new File("e:/c.txt");
//        FileOutputStream fos=new FileOutputStream(file);
//        FileOutputStream fos=new FileOutputStream("e:/c.txt");
//        FileInputStream fis=new FileInputStream("e:/d.txt");
      /*  File file1=null;
        file1.exists();*/

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数据:");
        String s1 = sc.next();
        System.out.println(s1);
        String s2 = sc.nextLine();
        System.out.println(s2);
       /* System.out.print("请再次输入数据:");
        String s2 = sc.nextLine();
*/

    }
}
