package de.tu_ilmenau.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
    关于集合的迭代/遍历
 */
public class CollectionTest03 {
    public static void main(String[] args) {
        //创建集合对象
        //ArrayList有序可以重复
        Collection c1 = new ArrayList();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);
        //存进去是什么类型，取出来就是什么类型，只不过sout的时候输出的是字符串，因为用了valueOf方法
        Iterator it = c1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //HashSet 无序不可重复
        Collection c2 = new HashSet();
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(100);    //100不会报错，只不过存不进去第二个
        c2.add(50);
        c2.add(900);
        c2.add(650);

        Iterator it2 = c2.iterator();
        while (it2.hasNext()) {
            System.out.print(it2.next() + " "); //50 100 900 200 650 300 明显不是按存入顺序来了

        }

    }
}
