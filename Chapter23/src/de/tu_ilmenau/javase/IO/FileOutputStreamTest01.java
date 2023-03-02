package de.tu_ilmenau.javase.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件字节输出流，负责写
    从内存到硬盘
    write(byte[] b, start, length)
    如果想要追加写入而不是清空原文件再写入，应该使用构造方法
    fos = new FileOutputStream("TempFile",true);

 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
//            fos = new FileOutputStream("chapter23/src/myfile",true);
            fos = new FileOutputStream("chapter23/src/myfile");//这里实际上是新建一个管道
            //开始写！这种方式会先将原文件内容清空，再重新写入
            byte[] bytes = {97, 98, 99, 100, 101, 102}; //abcdef
            /*fos.write(bytes);
            fos.write(bytes, 5,1);
            *///从2号位置开始，往后写4个

            //要写入字符串可以先将String类型转换成数组，然后再写入
            String s = "我是一个广东人";
            byte[] bs = s.getBytes(); //String对象的转换方法
            fos.write(bs);



            //注意！写完之后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
