package de.tu_ilmenau.javase.IO.file;

import java.io.File;

/*
    关于File类下的listFiles()方法，返回的是File[] 可以获取当前目录下的所有子目录
 */
public class FileTest03 {
    public static void main(String[] args) {
        File f = new File("D:/");
        File[] files = f.listFiles();
        for (File s: files
             ) {
            System.out.println(s.getAbsolutePath()); //每次获取绝对路径
            System.out.println(s.getName());
        }
    }
}
