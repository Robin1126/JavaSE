package de.tu_ilmenau.javase.collection;
/*
    对于链表数据结构来说，单元是节点Node
    节点是单向列表的基本单元，每个Node都有2个属性：
        一个属性：存储的数据
        另一个属性：下一个节点的内存地址
        每个节点永远都有下一个节点的内存地址
    优点：随机增删元素效率比较高，因为不涉及到大量元素位移
    缺点：检索效率比较低，要从头往下找

 */
public class LinkedListTest01 {
    public static void main(String[] args) {
        Link link = new Link();
        link.add(100);
        link.add(200);
        link.add(300);
        System.out.println(link.size());

    }
}

class Node {
    //存储的数据
    Object data;

    //下一个节点的内存地址
    Node next;

    public Node() {
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
