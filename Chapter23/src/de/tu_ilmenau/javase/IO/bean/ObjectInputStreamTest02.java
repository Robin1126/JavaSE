package de.tu_ilmenau.javase.IO.bean;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/*
    反序列化集合，当类中使用关键字transitent可以不序列化某个具体的属性
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users"));

        List<User> userList = (List<User>) ois.readObject();
        for (User u: userList
             ) {
            System.out.println(u); //由于name已经被transitent修饰，序列化不能，所以反序列化的时候出来的name都是默认值null
        }
    }
}
