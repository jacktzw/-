package exercise;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server01 {
    public static void main(String[] args) {
        List<Socket> sockets=new ArrayList<>();
        try {
            ServerSocket server=new ServerSocket(6666);
            System.out.println("服务器端创建完成!!!");
            while(true){
                Socket s = server.accept();
                System.out.println(s.getInetAddress().getHostName()+"linked");
                sockets.add(s);
                //启动服务线程

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
