package test1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(6666);
        System.out.println("服务端创建完成");
        Socket accept = server.accept();
        //
        InputStream is = accept.getInputStream();
        OutputStream os=accept.getOutputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        Scanner sc=new Scanner(System.in);
        while(true){
            //接收数据
            System.out.println(br.readLine()+"----------");
            //发送数据
            bw.write(sc.nextLine());
            bw.newLine();
            bw.flush();
        }
    }
}
