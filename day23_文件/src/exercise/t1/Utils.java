package exercise.t1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//人员名单管理系统
public class Utils {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    String name;

    public void add() {
        System.out.println("请输入要添加的姓名:");
        name = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(name)) {
                System.out.println("该人员姓名已添加");
                return;
            }
        }
        list.add(name);
    }

    public void remove() {
        System.out.println("请输入要删除的姓名:");
        name = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i))) {
                list.remove(name);
                return;
            }
        }
        System.out.println("你要删除的姓名不存在!");
    }

    public void update() {
        System.out.println("请输入要修改的姓名:");
        name = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i))) {
                System.out.println("请输入修改后的姓名:");
                name = sc.nextLine();
                list.set(i, name);
                return;
            }
        }
        System.out.println("你输入的姓名不存在!");
    }

    public void select() {
        System.out.println("显示如下:");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void menu() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        File file = null;
        try {
            file = new File("D:/stu.txt");
            //第一次读取时判断文件是否存在
            if (file.exists()) {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                list = (ArrayList<String>) ois.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (file.length()!=0) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.println("1.添加人员2.查询所有人员3.修改人员4.删除人员5.保存退出");
            String key = sc.nextLine();
            switch (key) {
                case "1":
                    add();
                    break;
                case "2":
                    select();
                    break;
                case "3":
                    update();
                    break;
                case "4":
                    remove();
                    break;
                case "5":
                    file = new File("D:/stu.txt");
                   /* try {
                        file.createNewFile(); //第一次保存时创建文件
                    } catch (IOException e) {
                        e.printStackTrace();
                    }*/
                    FileOutputStream fos = null;
                    ObjectOutputStream ots = null;
                    //if (file.exists()) {
                        try {
                            //第一次创建时可以自动创建d盘下面的文件，但是有目录不行
                            fos = new FileOutputStream(file);
                            ots = new ObjectOutputStream(fos);
                            ots.writeObject(list);
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                ots.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    //}
                    System.exit(0);
                    break;
            }
        }
    }

}
