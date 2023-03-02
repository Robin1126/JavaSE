package de.tu_ilmenau.javase.collection;
/*
    这个是自己写的Link，但是sun公司已经写好了一个LinkedList
    这里是自己定义的数据结构，单向链表
 */
public class Link<E> {
    Node header = null; //新建的Link自带头节点
    int size = 0; //默认链表的长度

    public int size() {
        return size;
    }

    public void add(E data) {
        //加元素有可能是第一个，有可能是第二个，第三个。。。
        if (header == null) { //说明还没有头节点
            header = new Node(data,null);
        }else { //说明头不是空,让当前末尾节点的next是新节点
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data, null);
        }
        size++;
    }

    private Node findLast(Node node) { //专门查找末尾节点的，从头开始找
        if (node.next == null) {
            return node;
        }
        return findLast(node.next);

    }

    public void remove(Object obj){

    }
    public void modify(Object newObj) {

    }
    public int find(Object obj) {
        return 0;
    }
}
