package de.tu_ilmenau.javase.IO;

import java.io.BufferedReader;
import java.io.FileReader;

/*
    BufferedReader:
        带有缓冲区的字符输入流。
        使用这个流的时候不需要自定义char数组，或者说也不需要自定义byte数组。自带缓冲
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception{

        FileReader fr = new FileReader("Copy02.java");
        //当一个流的构造方法中包含另一个流，这个传进来的流称为节点流，外面的流称为包装流或者叫做处理流
        // 这里fr就是一个节点流，br是一个包装流
        BufferedReader br = new BufferedReader(fr);

        /*String firstLine = br.readLine();
        System.out.println(firstLine);
        String secondLide = br.readLine();
        System.out.println(secondLide);*/
        String s = null;
        while ((s = br.readLine()) != null) { //一次读一行，但是不带换行符
            System.out.println(s);
        }

        // 关闭流，节点流不用管，因为这里br调用的close实际上关闭的是里面的fr的流
        // fr实际上称为了br里面的属性，br就是包装它的
        br.close();
    }
}
