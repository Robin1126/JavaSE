package de.tu_ilmenau.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    集合使用增强for循环
 */
public class ForEachTest02 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();

        strList.add("Hello");
        strList.add("world");
        strList.add("kitty");

        //使用迭代器Iterator
        Iterator<String> it = strList.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        //使用增强for
        for (String data:strList
             ) {
            System.out.println(data);
        }

        //使用for循环
        for (int i = 0; i < strList.size(); i++) {
            String s = strList.get(i); //get方法获取List的下标
            System.out.println(s);
        }
    }
}
