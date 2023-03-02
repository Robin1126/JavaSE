package de.tu_ilmenau.javase.IO;

import java.io.FileWriter;
import java.io.IOException;

/*
    FileWriter文件字符输出流，只能输出文本,只能读普通的txt文本这种
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("Chapter23/src/myfile1"); //不想清空可以在这后面添加
            //写文件！
            String s = "布布最喜欢一二宝宝啦~";
            char[] chars = s.toCharArray();
            fw.write(chars);
            fw.write(chars, 2,3);
            fw.write("\n");
            fw.write("Hello World!");

            //写完要添加flush
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
