package de.tu_ilmenau.javase.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    利用FileReader和FileWriter完成文本文件的拷贝
 */
public class Copy02 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("Chapter23/src/myfile1");
            fw = new FileWriter("D:/target/myfile1");
            char[] chars = new char[512 * 1024]; //1MB 因为char是2个字节，所以2*512就是1kB，再乘以1024就是1MB
            int count = 0;
            while ((count = fr.read(chars)) != -1){
                fw.write(chars);
            }
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            extracted(fr, fw);
        }

    }

    private static void extracted(FileReader fr, FileWriter fw) {
        if (fr != null){
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (fw != null){
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
