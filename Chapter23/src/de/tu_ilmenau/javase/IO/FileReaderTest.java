package de.tu_ilmenau.javase.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader:
    文件字符输入流，只能读入字符流
    读取文本内容时，比较方便
 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("Chapter23/src/myfile");
            char[] chars = new char[2];
            int result = 0;

            while ((result = reader.read(chars)) != -1) {
                System.out.print(new String(chars, 0, result));
            }
            /*
                也可以用foreach循环读取char[]数组里面的东西
             */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
