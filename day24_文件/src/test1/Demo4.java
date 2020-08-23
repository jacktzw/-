package test1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        /**
         *
         */
        //File file=new File("e:/ss.txt");
        //File file=new File("ss.txt");
        // boolean mkdir = file.mkdir();
      /*  System.out.println(file.isFile());
        if(file.isFile()){
            file.createNewFile();
        }
        //System.out.println(mkdir);
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());*/
        File file = new File("e:/a");
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.getName().endsWith(".java")) {
                System.out.println(file1.getName() + "----文件");
            }
        }
        //匿名类。。。实现FileFilter接口
       /* File[] files2=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isFile()&&pathname.getName().endsWith("java")){
                    return true;
                }
                return false;
            }
        });*/
        File[] javas = file.listFiles((pathname) -> {
               if (pathname.isFile() && pathname.getName().endsWith("java")) {
                return true;
             }
            return false;
        });
        for (File file1 : javas) {
            System.out.println(file1.getName());
        }
        System.out.println(File.pathSeparator);
    }
}
