package de.tu_ilmenau.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    remove方法
    由于重写了ArrayList中的equals方法，所以这里认为s1和s2是相同的，所以会一起移除
    当集合的结构发生改变是，迭代器必须重新获取,因为迭代器是快照机制
 */
public class CollectionTest06 {
    public static void main(String[] args) {
        Collection cc = new ArrayList();
        //集合结果如果发生改变，迭代器必须重新获取

        String s1 = new String("abc");
        cc.add(s1);

        String s2 = new String("abc");
        cc.remove(s2); //
        System.out.println(cc.size());
        cc.add(1);
        cc.add(2);
        cc.add(3);
        Iterator it = cc.iterator(); //迭代器是一个快照，要在集合稳定了以后再获取
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Collection c2 = new ArrayList();
        c2.add("abc");
        c2.add("def");
        c2.add("xyz");

        Iterator it2 = c2.iterator();
        // 注意不能在这个循环中不能直接删除元素，因为集合的结构发生了改变ConcurrentModificationException
        while (it2.hasNext()) {
            Object o = it2.next();
//            c2.remove(o);
            System.out.println(o);
        }
    }

}
