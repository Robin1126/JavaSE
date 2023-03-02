package de.tu_ilmenau.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
/*
    ArrayList的构造方法
 */
public class ArrayListTest02 {
    public static void main(String[] args) {
        List myList1 = new ArrayList();
        List myList2 = new ArrayList();

        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(300);

        List myList3 = new ArrayList(c); //可以直接构造包含Collection c元素的集合，这些元素是按照Iterator返回 它们的顺序排列的
        for (int i = 0; i < myList3.size(); i++) {
            System.out.println(myList3.get(i));//因为有下标

        }

    }
}
