package de.tu_ilmenau.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    测试List接口中的常用方法
        1. List集合存储元素的特点：有序可重复
            有序：元素有下标。从0开始，以1递增
            可重复：存了一个1还可以再存一个1
        2. List既然是Collection接口的子接口，那么肯定List接口有自己特色的方法
            特有的常用方法
                void add(int index, Object element);
                Object get (int index)
                int indexOf(Object o)
                int lastIndexOf(Object o)
                Object remove(int index)
                Object set(int index, Object element)
            以上的代码不需要死记硬背，开发的时候还是要翻阅文档

        3. ArrayList初始化容量是10，它是一个Object数组

 */
public class ListTest01 {
    public static void main(String[] args) {
        //不能用Collection了，这些都是特有方法
        List myList = new ArrayList();

        //添加元素
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("C");
        myList.add("D");

        //在1号位插入了king，后面的元素往后移动，而默认是往集合的尾部插入元素
        //这方法使用不多，使用效率比较低，因为元素涉及了位移
        myList.add(1, "king");

        //Object get （int index）
        Object firstObj = myList.get(3);
        System.out.println(firstObj);

        //迭代
        Iterator it = myList.iterator();
        while (it.hasNext()) {
            Object elt =it.next();
            System.out.println(elt);
        }
        //因为List有下标，所以有自己的特殊方式遍历,利用for循环 get（index）

        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }

        //对象第一次出现的索引 indexOf(Object o)
        System.out.println(myList.indexOf("C"));

        //对象最后一次出现的索引 lastIndexOf(Object o)
        System.out.println(myList.lastIndexOf("C"));

        //删除指定下标的元素
        myList.remove(0);
        System.out.println(myList.size());

        //改动指定下标的元素,上面的C变成了soft
        myList.set(2, "soft");
        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }
    }
}
