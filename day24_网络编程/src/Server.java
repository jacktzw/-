import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        //服务器类
        /**
         * 服务器端核心工具类 ServerSocket
         *
         */
        //1.创建服务器对象，绑定端口
        ServerSocket server=new ServerSocket(6666);
        System.out.println("服务器开始创建.....");
        //2.监听是否有客户端进行连接服务器
        Socket sk = server.accept();
        //返回客户端对象
        System.out.println("客户端已经连接...........");
        //接收客户端发送的消息
        InputStream is = sk.getInputStream();
        InputStreamReader sr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(sr);
        String s = br.readLine();
        System.out.println(s);
      //  br.close();


    }
}
