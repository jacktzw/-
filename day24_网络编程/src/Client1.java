import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws IOException {
        /**
         * 客户端核心类Socket
         *
         */
        Socket socket = new Socket("127.0.0.1", 6666);
        // Socket socket1 = new Socket("192.168.58.171", 5000);
        System.out.println("客户端创建完成..............");
        OutputStream os = socket.getOutputStream();
        OutputStreamWriter ow = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(ow);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请发送消息");
            String msg = sc.nextLine();
            if(msg!=null){
                bw.write(msg);
                bw.newLine();
                bw.flush();
            }
        }
    }
}
