package de.tu_ilmenau.javase.collection.list;

import java.util.*;

/*
    1.Vector的底层也是一个数组
    2.初始化容量也是10
    3.每次扩容之后翻一倍容量
    4.ArrayList是扩容1.5倍，增长50%
    5.Vector中所有方法都是synchronized都是线程安全的
    6.怎么将一个线程不安全的ArrayList集合转换成为线程安全的呢？
        使用集合工具类：
            java.util.Collections;
            java.util.Collection是集合接口
            java.util.Collections是集合工具类

 */
public class VectorTest01 {
    public static void main(String[] args) {
        List list = new Vector();

        list.add(1);
        list.add(2);

        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }

        Iterator it = list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        //这个可能以后要用
        List myList = new ArrayList();
        //变成线程安全的
        Collections.synchronizedList(myList);
        //这个暂时没办法看效果，先记住

        myList.add("111");
        myList.add("222");
        myList.add("333");

    }
}
