package de.tu_ilmenau.javase.collection;

import java.util.Set;
import java.util.TreeSet;

/*
    TreeSet存储特点
    1. 无序不可重复
    2. 内部元素可以从小到大排序，可排序
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<String> strs = new TreeSet<>();
        //添加元素
        strs.add("b");
        strs.add("a");
        strs.add("c");
        strs.add("y");
        strs.add("z");
        //自动从小到大排序
        for (String s: strs
             ) {
            System.out.println(s);
        }
    }
}
