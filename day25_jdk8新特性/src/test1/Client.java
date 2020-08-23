package test1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket=new Socket("127.0.0.1",6666);
        System.out.println("客户端连接成功......");
        InputStream is = socket.getInputStream();
        OutputStream os=socket.getOutputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        Scanner sc=new Scanner(System.in);
        while(true){
            //发送数据
            bw.write(sc.nextLine());
            bw.newLine();
            bw.flush();
            //接收数据
            System.out.println(br.readLine()+"********客户端");
        }
    }
}
