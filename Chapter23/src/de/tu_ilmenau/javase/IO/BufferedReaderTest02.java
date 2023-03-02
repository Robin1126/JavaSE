package de.tu_ilmenau.javase.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/*
    转换流InputStreamReader
 */
public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("Chapter23/src/de/tu_ilmenau/javase/IO/Copy02.java"); //构造方法只能传一个字符流
        //通过转换流转换
        InputStreamReader reader = new InputStreamReader(in); //字节流转成字符流，in是节点流，reader是包装流
        BufferedReader br = new BufferedReader(reader);// reader是节点流，BufferedReader是包装流

        String line = null;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
    }
}
