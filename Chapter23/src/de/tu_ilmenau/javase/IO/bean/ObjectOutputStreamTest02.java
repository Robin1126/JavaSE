package de.tu_ilmenau.javase.IO.bean;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/*
    利用集合一次序列化多个对象
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception{
        List<User> list = new ArrayList<>();
        list.add(new User(20,"bubu"));
        list.add(new User(21,"yier"));
        list.add(new User(22,"zky"));
        list.add(new User(23,"lbb"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users"));

        oos.writeObject(list);

        oos.flush();
        oos.close();
    }
}
