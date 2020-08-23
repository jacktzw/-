package test2;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        FileReader fs=new FileReader("d:/a.txt");
        FileWriter fw=new FileWriter("e:/b.txt");
        char[] buff=new char[3];
       /* int num=0;
        while((num=fs.read())!=-1){
            fw.write(num);
        }
        fs.close();
        fw.close();*/
       int count=0;
       while((count=fs.read(buff))!=-1){
           fw.write(new String(buff,0,count));
       }
       fs.close();
       fw.close();


    }
}
