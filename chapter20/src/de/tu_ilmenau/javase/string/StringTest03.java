package de.tu_ilmenau.javase.string;
//分析创建了几个对象
public class StringTest03 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        //应该是3个String对象，s1，s2不叫对象，叫做变量
        //方法区中存了一个常量对象hello，堆内存当中有两个String对象

    }
}
