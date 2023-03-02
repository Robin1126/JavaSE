package de.tu_ilmenau.javase.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    最终版，利用循环和数组实现文件字节流的输入
    掌握这个就可以了！！一般很少用read（）方法，太慢了
 */
public class FileInputTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        byte[] bytes = new byte[4];

        try {
            fis = new FileInputStream("Chapter23/src/HelloWorld");
            int result = 0;
            while ((result = fis.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, result));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
