package de.tu_ilmenau.javase.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    通过FileInputStream和FileOutputStream完成一个文件的拷贝
    拷贝的过程应该是一边读一边写
    使用Stream字节流是万能的，什么都能拷贝
 */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("Chapter23/src/myfile");
            fos = new FileOutputStream("D:/target/myfile");

            byte[] bytes = new byte[1024 * 1024];// 1MB
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1) {
                fos.write(bytes, 0 ,readCount); //把byte数组里的东西写到fos对应的文件上面
            }

            //刷新流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 分开尝试，其中一个出现异常会影响到另一个的关闭
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
