package de.tu_ilmenau.javase.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
    关于集合遍历/迭代
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        // 注意：以下讲解的迭代方式是，是所有Collection通用的一种方式
        // 在Map集合中不能使用，在所有Collection以及子类中使用，一般就是ArrayList，LinkedList，Vector，TreeSet，HashSet
        Collection c = new HashSet();
        //添加元素
        c.add(100);
        c.add("abc");
        c.add("def");
        c.add(new Student());

        //首先获取迭代器
        Iterator it = c.iterator(); //这个方法就是返回一个迭代器
        //通过迭代器对象进行迭代
        /*
            迭代器方法
                1. boolean hasNext() 如果仍有元素可以迭代，返回true，就是下一个位置有元素吗？返回boolean
                2. Object next() 返回迭代的下一个元素，迭代器前进一位，然后读取元素
            迭代器对象it就相当于new了一个箭头
            每次都是先hasNext()然后用next()
         */
       /* boolean hasNext = it.hasNext();

        if (hasNext) {
            Object obj = it.next(); //取出来的一定是Object
            System.out.println(obj);
        }

        hasNext = it.hasNext();
        if (hasNext) {
            Object obj = it.hasNext();
            System.out.println(obj);
        }
        hasNext = it.hasNext();
        if (hasNext) {
            Object obj = it.hasNext();
            System.out.println(obj);
        }
        hasNext = it.hasNext();
        if (hasNext) {
            Object obj = it.hasNext();
            System.out.println(obj);
        }
        hasNext = it.hasNext();
        if (hasNext) {
            Object obj = it.hasNext();
            System.out.println(obj);
        }*/
        //一直取会变成NoSuchElementException
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
