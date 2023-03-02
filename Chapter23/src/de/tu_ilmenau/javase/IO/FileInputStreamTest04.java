package de.tu_ilmenau.javase.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    FileInputStream中其他的方法
        1. int available():返回流当中剩余的字节数
        2. long skip(long n) :跳过n个字节
    read()返回的是这个字节本身的ASCII码

    利用available方法可以一次读取所有的字节，但是不适合大文件！！因为byte数组不能太大！
 */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            /*fis = new FileInputStream("chapter23/src/HelloWorld");
            System.out.println("本文件总共的字节数量： " + fis.available());
            //方便我们new一个适合大小的byte数组

            byte[] bytes = new byte[fis.available()];

//            int readByte = fis.read();
            int readByte = fis.read(bytes);
            System.out.println(new String(bytes, 0, readByte));
            //一次读完，不需要循环了
            System.out.println("还剩下的字节数： " + fis.available()); //还剩下5个字节
            */
            fis = new FileInputStream("TempFile");
            fis.skip(3);
            System.out.println(fis.read());// a 97 b 98 c 99 跳过三个以后到d 100

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
