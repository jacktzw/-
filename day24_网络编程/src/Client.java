import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        /**
         * 客户端核心类Socket
         *
         */
        Socket socket = new Socket("127.0.0.1", 777);
        // Socket socket1 = new Socket("192.168.58.171", 5000);
        System.out.println("客户端创建完成..............");
        OutputStream os = socket.getOutputStream();
        OutputStreamWriter ow = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(ow);
        bw.write("哈哈哈");
        bw.newLine();
        bw.flush();


    }
}
