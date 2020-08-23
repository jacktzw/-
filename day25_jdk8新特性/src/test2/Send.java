package test2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Send extends Thread {
    BufferedWriter bw;
    @Override
    public void run() {
        Scanner sc=new Scanner(System.in);
        while(true) {
            try {
                String msg=sc.nextLine();
                bw.write(msg);
                bw.newLine();
                bw.flush();
                if(msg.equals("886")){
                   break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
