package test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Recent extends Thread {
    BufferedReader br;
    @Override
    public void run() {
        while (true) {
            try {
                String msg = br.readLine();
                System.out.println(msg);
                if (msg.equals("886")) {
                    break;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
