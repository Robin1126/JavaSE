package de.tu_ilmenau.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    深入contains（Object o） 判断集合中是否包含某个对象o，包含就返回true，否则返回false

    contains方法的底层是调用equals方法，因此实际上是看内容而不是看地址

 */
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add(new String("abc"));
        c.add(new String("def"));

        System.out.println("元素的个数是:" + c.size());

        String x = new String("abc"); //new了对象，在堆里面，对象保存的是常量池abc的地址
        System.out.println(c.contains(x)); //但是contains中用了equals方法，而String是重写过equals方法的，实际上比较的是object的内容
    }
}
