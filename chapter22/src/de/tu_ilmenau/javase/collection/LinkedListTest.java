package de.tu_ilmenau.javase.collection;

import java.util.List;
/*
    LinkedList也是有下标的哦！ Arraylist检索效率高是因为底层是数组，LinkedList照样有下标，但是检索效率低，只能从头节点开始一个个往下找

    链表的优点：由于链表上的元素在空间存储上内存地址不连续。所以在随机增删的时候不涉及大量元素的位移
    在以后的开发中，如果遇到随机增删集合中元素的业务比较多时，建议使用LinkedList

    缺点：不能通过数学表达式计算被查询的元素的地址，每次都要从头节点开始找，所以LinkedList集合检索/查找的效率比较低

    还好一般都是往末尾加减元素，因此ArrayList用的比较多
 */
public class LinkedListTest {
    public static void main(String[] args) {
        Link<String> link = new Link<>();
        link.add("abc");


        List list = new java.util.LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }

    }
}
