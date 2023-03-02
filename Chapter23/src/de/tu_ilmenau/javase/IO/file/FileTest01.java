package de.tu_ilmenau.javase.IO.file;

import java.io.File;

/*
    File是什么？ File是文件或者路径的抽象表达
        1. File类和四大家族没有关系
            四大家族：InputStream，OutputStream，Reader,Writer
        2. File对象表示什么？
            文件或者路径名的抽象表现形式，也就是说计算机中的一切皆为file，它是Object的一个子类
            如 C:\driver 是一个file， C:\driver\wow.exe也是一个file
        3. 需要掌握File类当中的方法，但是不能通过它完成文件的读和写

 */
public class FileTest01 {
    public static void main(String[] args) throws Exception {
        //创建一个file对象
        File f1 = new File("D:/target/file");

        //exists方法判断是否存在
        System.out.println(f1.exists());

        //如果不存在，则以文件的形式新建出来 creatNewFile()
        /*if (!f1.exists()) {
            f1.createNewFile();
        }*/

        //如果不存在，以目录的形式新建出来 mkdir()
        /*if (!f1.exists()){
            f1.mkdir();
        }*/
        //如何创建多重目录呢 mkdirs
        File file2 = new File("D:/a/b/c/d");
        /*if (!file2.exists()) {
            file2.mkdirs();
        }*/

        // 输出文件的父目录，也就是上一级目录 getParent()
        File f3 = new File("D:\\target\\myfile");
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        File parentFile = f3.getParentFile(); //获取父文件
        System.out.println("获取绝对路径：" + parentFile.getAbsolutePath());

        //获取绝对路径 getAbsolutePath
        File f4 = new File("copy");
        System.out.println("copy的绝对路径是：" + f4.getAbsolutePath());
    }
}
