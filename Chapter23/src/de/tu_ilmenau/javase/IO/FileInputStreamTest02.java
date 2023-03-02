package de.tu_ilmenau.javase.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    int read(byte[] b)
     一次最多读取b.length个字节，减少硬盘和内存的交互，提升效率
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        byte[] bytes = new byte[4];
        try {
            // 相对路径一定是从当前位置开始找
            // IDEA的默认路径在工程Project的默认位置,是project的根
            fis = new FileInputStream("Chapter23/src/HelloWorld");
            int readCount = fis.read(bytes);
            //返回的是读到的字节数量
            System.out.println(readCount); //4
            //现在把它转换成字符串怎么办？
            System.out.println(new String(bytes, 0, readCount));
            //不用全部改写，而是读多少个写多少个

            readCount = fis.read(bytes);
            System.out.println(readCount); //剩下的2个
            System.out.println(new String(bytes, 0, readCount));

            readCount = fis.read(bytes);
            System.out.println(readCount); //没有数据了，返回-1

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
