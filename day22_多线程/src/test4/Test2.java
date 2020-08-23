package test4;

import exercise.Book;

import java.util.*;

public class Test2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<Book> list = new ArrayList<>();
            Map<String,Book> list2 = new HashMap<>();//存储借出的图书
            String name = null;
            String author = null;
            String desc = null;
            Book bk=null;
            Iterator<Book> iterator;
            while (true) {
                boolean b = true;
                System.out.println("********欢迎来到图书管理系统*********");
                System.out.print("1.添加图书");
                System.out.print("2.根据书名查询图书");
                System.out.print("3.删除图书");
                System.out.print("4.修改图书");
                System.out.print("5.借出图书");
                System.out.print("6.归还图书");
                System.out.print("7.统计借出的图书");
                System.out.print("8.统计所有图书");
                System.out.println("9.退出");
                String s = sc.nextLine();
                switch (s) {
                    case "1":
                        System.out.println("请输入书名:");
                        name = sc.nextLine();
                        System.out.println("请输入作者:");
                        author = sc.nextLine();
                        System.out.println("请输入简介:");
                        desc = sc.nextLine();
                        list.add(new Book(name, author, desc));
                        break;
                    case "2":
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
                        break;
                    case "3":
                        System.out.println("请输入书名:");
                        name = sc.nextLine();
                        iterator = list.iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next().getName().indexOf(name) > -1) {
                                iterator.remove();
                                b = false;
                            }
                        }
                        if (b) {
                            System.out.println("未找到相关图书");
                        }
                        break;
                    case "4":
                        System.out.println("请输入书名:");
                        name = sc.nextLine();
                        for (Book book : list) {
                            if (book.getName().indexOf(name) > -1) {
                                System.out.println(book);
                                System.out.println("请输入要修改的书名:");
                                name = sc.nextLine();
                                System.out.println("请输入要修改的作者:");
                                author = sc.nextLine();
                                System.out.println("请输入要修改的简介:");
                                desc = sc.nextLine();
                                book.setName(name);
                                book.setAnthor(author);
                                book.setDesc(desc);
                                b = false;
                            }
                        }
                        if (b) {
                            System.out.println("未找到相关图书");
                        }
                        break;
                    case "5":
                        System.out.println("请输入要借出的书名:");
                        name = sc.nextLine();
                        iterator = list.iterator();
                        while (iterator.hasNext()) {
                            bk=iterator.next();
                            if (bk.getName().indexOf(name) > -1) {
                                list2.put(bk.getName(),bk);
                                bk.setInTime(new Date().getTime());
                                iterator.remove();
                                b = false;
                            }
                        }
                        if (b) {
                            System.out.println("未找到相关图书");
                        }
                        break;
                    case "6":
                        System.out.println("请输入要归还的书名:");
                        name = sc.nextLine();
                        Collection<Book> values = list2.values();
                        iterator = values.iterator();
                        while (iterator.hasNext()) {
                            bk=iterator.next();
                            if (bk.getName().indexOf(name) > -1) {
                                list.add(bk);
                                bk.setOutTime(new Date().getTime());
                                iterator.remove();
                                b = false;
                            }
                        }
                        if(b==false){
                            System.out.println("租金为:"+((bk.getOutTime()-bk.getInTime())/1000)+"元");
                        }
                        if (b) {
                            System.out.println("未找到相关图书");
                        }
                        break;
                    case "7":
                        System.out.println("请输入书名:");
                        name = sc.nextLine();
                        for (Book book : list2.values()) {
                            if (book.getName().indexOf(name) > -1) {
                                System.out.println(book);
                                b = false;
                            }
                        }
                        if (b) {
                            System.out.println("未找到相关图书");
                        }
                        break;
                    case "8":
                        for (Book book : list) {
                            System.out.println(book);
                        }
                        break;
                    case "9":
                        System.exit(0);
                        break;
                }
            }
        }
    }


