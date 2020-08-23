package test2;

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
        Recent recent=new Recent();
        Send  send=new Send();
        recent.br=br;
        send.bw=bw;
        recent.start();
        send.start();
    }
}
