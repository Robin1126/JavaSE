package de.tu_ilmenau.javase.collection;

import java.util.ArrayList;
import java.util.List;

/*
    ArrayList集合
        1. 初始化默认容量10 底层先创建了长度为0的数组，当添加第一个元素的时候，初始化容量为10
        2. 集合底层是一个Object数组
        3. 构造方法 new ArrayList(int capacity);
        4. ArrayList的扩容：
            是原来的1.5倍，增长了右移一位
            建议一个预估计的初始化容量，减少扩容的次数。
    右移就是/2的n次方，左移就是*2的n次方
    原先是4，现在增长2，增长为6，是原来的1.5倍
        5. 数组优点：检索效率高
        6. 缺点：随机增删效率低
        7. 向数组末尾增删元素，效率高
        8. ArrayList的使用最多，因为往数组末尾增删元素不受影响，另外检索操作比较多
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        List lis1 = new ArrayList(); //底层是已给Object数组，容量为10
        System.out.println(lis1.size()); //size获取的是元素的个数

        List lis2 = new ArrayList(20); //指定容量
    }
}
