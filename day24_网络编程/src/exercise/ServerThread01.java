package exercise;

import java.net.Socket;
import java.util.List;

public class ServerThread01 extends Thread {
    private Socket socket;
    private List<Socket> list;
    ServerThread01(Socket socket,List<Socket> list){
        this.socket=socket;
        this.list=list;
    }
    @Override
    public void run() {

    }
}
