package exercise;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookSystem {
    Scanner sc;
    String name = null;
    String author = null;
    String desc = null;
    Book bk = null;
    Iterator<Book> iterator;
    List<Book> list = new ArrayList<>();
    Map<String, Book> list2 = new HashMap<>();//存储借出的图书
    boolean b;
    /**
     * 初始化
     * @param sc
     * @return
     */
    public BookSystem(){
        File file=new File("e:/book.txt");
        File file_lend=new File("e:/book_lend.txt");
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        FileInputStream fis_lend=null;
        ObjectInputStream ois_lend=null;
        try {
            if(file.exists()&&file.isFile()){
                fis=new FileInputStream(file);
                ois=new ObjectInputStream(fis);
                list= (List<Book>) ois.readObject();
            }
            if(file_lend.exists()){
                fis_lend=new FileInputStream(file_lend);
                ois_lend=new ObjectInputStream(fis_lend);
                list2= (Map<String,Book>) ois_lend.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(file.exists()) {
                    ois.close();
                }
                if(file_lend.exists()){
                    ois_lend.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public String init(Scanner sc) {
        b = true;
        System.out.println("********欢迎来到图书管理系统*********");
        System.out.println("1.添加图书2.根据书名查询图书3.删除图书4.修改图书5.借出图书6.归还图书7.统计借出的图书8.统计所有图书9.退出");
        this.sc = sc;
        return sc.nextLine();
    }

    /**
     * 添加图书
     * @return
     */
    public boolean addBook() {
        input1();
        System.out.println("请输入要添加的简介:");
        desc=sc.nextLine();
        for (Book book : list) {
            if(book.getName().equals(name)){
                System.out.println("书名已存在请不要重复添加!");
                return false;
            }
        }
        return list.add(new Book(name, author, desc));
    }

    /**
     * 根据书名模糊查询图书
     */
    public void queryBook() {
        System.out.println("请输入书名:");
        name = sc.nextLine();
        for (Book book : list) {
            if (book.getName().indexOf(name) > -1) {
                System.out.println(book);
                b = false;
            }
        }
        if (b) {
            System.out.println("未找到相关图书");
        }
    }

    /**
     * 删除图书
     *
     * @return 布尔值
     */
    public boolean removeBook() {
        System.out.println("请输入书名:");
        name = sc.nextLine();
        iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(name)) {
                iterator.remove();
                b = false;
            }
        }
        if (b) {
            System.out.println("未找到相关图书");
        }
        if (!b) {
            return true;
        }
        return false;
    }

    /**
     * 修改图书
     */
    public void updateBook() {
        System.out.println("请输入书名:");
        name = sc.nextLine();
        for (Book book : list) {
            if (book.getName().equals(name)) {
                System.out.println(book);
                input();
                book.setName(name);
                book.setAnthor(author);
                book.setDesc(desc);
                b = false;
            }
        }
        if (b) {
            System.out.println("未找到相关图书");
        }
    }

    /**
     * 借书图书
     */
    public void leadBook() {
        System.out.println("请输入要借出的书名:");
        name = sc.nextLine();
        iterator = list.iterator();
        while (iterator.hasNext()) {
            bk = iterator.next();
            if (bk.getName().equals(name)) {
                list2.put(bk.getName(), bk);
                bk.setInTime(new Date().getTime());
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.println("借出时间为: "+sdf.format(bk.getInTime()));
                System.out.println(bk);
                iterator.remove();
                b = false;
            }
        }
        if (b) {
            System.out.println("未找到相关图书");
        }
    }

    /**
     * 归还图书
     */
    public void rentBook() {
        System.out.println("请输入要归还的书名:");
        name = sc.nextLine();
        Collection<Book> values = list2.values();
        iterator = values.iterator();
        while (iterator.hasNext()) {
            bk = iterator.next();
            if (bk.getName().equals(name)) {
                list.add(bk);
                iterator.remove();
                b = false;
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                System.out.println("借出时间为: "+sdf.format(bk.getInTime()));
                System.out.println("归还时间为: "+sdf.format(new Date().getTime()));
                System.out.println(bk.getName()+"的租金为:" + ((new Date().getTime() - bk.getInTime()) / 1000) + "元");
            }
        }
        if (b) {
            System.out.println("未找到相关图书");
        }
    }

    /**
     * 统计所有借出图书
     */
    public void queryAllLeadBook() {
        for (Book book : list2.values()) {
            System.out.println(book);
        }
    }

    public void queryALLBook() {
        for (Book book : list) {
            System.out.println(book);
        }
    }
    public void input(){
        System.out.println("请输入要修改的书名:");
        name = sc.nextLine();
        System.out.println("请输入要修改的作者:");
        author = sc.nextLine();
        System.out.println("请输入要修改的简介:");
        desc=sc.nextLine();
    }
    public void input1(){
        System.out.println("请输入要添加的书名:");
        name = sc.nextLine();
        System.out.println("请输入要添加的作者:");
        author = sc.nextLine();
    }
    public void exit(){
        FileOutputStream fos= null;
        ObjectOutputStream oos= null;
        FileOutputStream fos_lend= null;//保存借出图书
        ObjectOutputStream oos_lend= null;//保存借出图书
        File file=null;
        try {
            fos = new FileOutputStream("e:/book.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            file=new File("e:/book_lend.txt");
            fos_lend = new FileOutputStream(file);
            oos_lend = new ObjectOutputStream(fos_lend);
            oos_lend.writeObject(list2);
           /* if(list2.size()>0){
                file=new File("e:/book_lend.txt");
                fos_lend = new FileOutputStream(file);
                oos_lend = new ObjectOutputStream(fos_lend);
                oos_lend.writeObject(list2);
            }
            if(list2.size()==0){
                file=new File("e:/book_lend.txt");
                file.delete();
            }*/
        }  catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
                oos_lend.close();
               /* if(list2.size()>0&&file!=null){
                    oos_lend.close();
                }*/
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.exit(0);
    }
}
