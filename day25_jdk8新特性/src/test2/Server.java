package test2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

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
        Recent recent=new Recent();
        Send  send=new Send();
        recent.br=br;
        send.bw=bw;
        recent.start();
        send.start();
    }
}
