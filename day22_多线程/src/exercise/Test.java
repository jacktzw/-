package exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BookSystem bookSystem = new BookSystem();
        while (true) {
            String input = bookSystem.init(sc);
            switch (input) {
                case "1":
                    if (bookSystem.addBook()) {
                        System.out.println("添加图书成功!");
                    }
                    break;
                case "2":
                    bookSystem.queryBook();
                    break;
                case "3":
                    if(bookSystem.removeBook()){
                        System.out.println("删除图书成功!");
                    }
                    break;
                case "4":
                    bookSystem.updateBook();
                    break;
                case "5":
                    bookSystem.leadBook();
                    break;
                case "6":
                    bookSystem.rentBook();
                    break;
                case "7":
                    bookSystem.queryAllLeadBook();
                    break;
                case "8":
                    bookSystem.queryALLBook();
                    break;
                case "9":
                    bookSystem.exit();
                    sc.close();
                    break;
            }
        }
    }
}
