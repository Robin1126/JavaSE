package de.tu_ilmenau.javase.collection.list;
/*
    双向链表有first和last两个node，最开始是空
    LinkedList没有初始化容量，最初只有last和first都是引用null
    这个时LinkedList的底层基础！！
 */
public class DoubleLinkedList {
}

class Node{
    Object data;
    Node prev;
    Node next;

    public Node() {
    }

    public Node(Object data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
