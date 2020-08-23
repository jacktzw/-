package test2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        FileReader fd=new FileReader("d:/b.txt");
        BufferedReader br=new BufferedReader(fd);
        String line=null;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
