package test2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        //read(char[3])
        //创建一个读取流对象
        FileReader fr=new FileReader("d:\\a.txt");
        char[] buff=new char[3];
        //定义一个数组，用于存储字符
/*        char[] buff=new char[3];
        int read = fr.read(buff);
        System.out.println(buff);
        System.out.println(read);
        int read1 = fr.read(buff)   ;
        System.out.println(buff);
        System.out.println(read1);
        int read2 = fr.read(buff);
        System.out.println(buff);
        System.out.println(read2);*/
        int num=0;
       /* while((num=fr.read(buff))!=-1){
            if(num<3){
                for (int i = 0; i < num; i++) {
                    System.out.print(buff[i]);
                }
            }else{
                 System.out.print(buff);
            }
        }*/
        while((num=fr.read(buff))!=-1){
            System.out.print(new String(buff,0,num));
        }
        fr.close();


    }
}
