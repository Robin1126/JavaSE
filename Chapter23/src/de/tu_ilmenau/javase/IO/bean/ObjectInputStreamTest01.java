package de.tu_ilmenau.javase.IO.bean;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
    反序列化
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));

        //反序列化
        Object obj = ois.readObject();
        //返回来是一个学生对象
        System.out.println(obj); //读的时候怎么只能读一个？

        ois.close();
    }
}
