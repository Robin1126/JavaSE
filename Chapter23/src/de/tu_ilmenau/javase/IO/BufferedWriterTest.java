package de.tu_ilmenau.javase.IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/*
    BufferedWriter: 带有缓冲的字符输出流
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws Exception  {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("copy"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy")));
        //写在一起也可以，将字节流转换成字符流
        bw.write("Hello World");
        bw.write("\n");
        bw.write("Hello Kitty!");
        bw.flush();
        bw.close();
    }
}
