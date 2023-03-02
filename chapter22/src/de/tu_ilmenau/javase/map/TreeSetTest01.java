package de.tu_ilmenau.javase.map;

import java.util.TreeSet;

/*
    TreeSet集合底层是一个TreeMap
    TreeMap的底层是一个二叉树
    放到TreeSet集合的元素等同于放到TreeMap的key部分
    TreeSet集合中的元素无序，不可重复，但是可以按照从小到大的顺序自动排序，称为可排序集合
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        //添加String
        ts.add("bubu");
        ts.add("yier");
        ts.add("zky");
        ts.add("lbb");
        //按照字典的顺序排序的
        for (String s: ts
             ) {
            System.out.println(s);
        }

    }
}
/*
    数据库中有许多数据：
    userid          name            birth
    ------------------------------------------
    1               bubu            1991-01-01
    2               yier            1992-02-02
    3               zky             1992-05-12
    4               lbb             1992-11-26
 */
