package exercise.t2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("E:/cs.txt");
        FileOutputStream fos1=new FileOutputStream("e:cs1.txt");
        FileInputStream fis=new FileInputStream("E:/cs.txt");
        String s="1-3-66-2-88-95-5656-77-8888-23";
        fos.write(s.getBytes());
        byte b[]=new byte[3];
        int num=0;
        StringBuffer sb=new StringBuffer();
        while((num=fis.read(b))!=-1){
            sb.append(new String(b,0,num));
        }
        //String[] split = sb.toString().split("-");
        Matcher matcher = Pattern.compile("\\d+").matcher(sb.toString());
        List<String> list=new ArrayList();
        while(matcher.find()){
            list.add(matcher.group());
        }
        String[] split = list.toArray(new String[list.size()]);
        int[] arr=new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i]=Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        sb.setLength(0);
        for (int i = 0; i < arr.length-1; i++) {
            sb.append(arr[i]+"-");
        }
        sb.append(arr[arr.length-1]);
        System.out.println(sb);
        fos1.write(sb.toString().getBytes());
        fos.close();
        fis.close();
        fos1.close();

    }
}
