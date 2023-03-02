package de.tu_ilmenau.javase.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
    分类
    输入流，输出流
    字节流，字符流：Stream结尾的为字节流，通用；Reader，Writer结尾的为字符流

    所有的流都有close()方法，关闭通道,实现了closeable接口
    只有输出流才有flush()方法，清空管道，如果管道不请空，有可能输出不完整 实现Flushable接口

    需要掌握的IO流
    文件专属
        FileInputStream，FileOutputStream
        FileReader, FileWriter

    Buffer
        BufferedInputStream, BufferedOutputStream
        BufferedReader,BufferedWriter

    转换
        InputStreamReader,OutputStreamWriter

    数据流
        DataInputStream,DataOutputStream

    标准输出流
        PrintWriter,PrintStream

    对象专属
        ObjectInputStream,ObjectOutputStream




    利用循环遍历的方法得出整个输入流
    缺点：一次读一个字节，增大了内存和硬盘交互的时间耗费，可以一次读取多个字节吗？
    可以！ 使用 read(byte[] b) 一次可以读取多个字节，取决于byte数组b的length
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\luobi\\Desktop\\java bilibili\\JavaSE\\Chapter23\\test");
            int result = 0;
            while((result = fis.read()) != -1) {
                System.out.print(new String(String.valueOf((char)result)));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
