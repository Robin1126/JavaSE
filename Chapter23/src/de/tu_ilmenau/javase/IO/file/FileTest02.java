package de.tu_ilmenau.javase.IO.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    File的常用方法
 */
public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("copy");
//        获取文件名 getName()
        System.out.println("文件名：" + f1.getName());


        //判断是否是一个目录
        System.out.println(f1.isDirectory()); //false
        //判断是否是一个文件
        System.out.println(f1.isFile());
        //获取文件最后一次修改时间
        long haoMiao = f1.lastModified(); //多少毫秒之前修改的
//        System.out.println("最后一次修改是 " + haoMiao + "毫秒之前"); //1970年到现在的毫秒数

        // 毫秒如何转日期？
        Date date = new Date(haoMiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        System.out.println("最后一次修改是 " + s);

        // 获取文件大小，有多少个字节byte
        System.out.println(f1.length()); //24
    }
}
