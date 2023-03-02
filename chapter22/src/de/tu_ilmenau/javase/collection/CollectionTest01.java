package de.tu_ilmenau.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    java.util.Collection接口中常用的方法,因为它是老祖中
    1. 如果没有泛型，那么可以往collection里面放所有的Object所有子类型，使用了泛型，就只能放某个具体的类型
        集合中不能直接存对象或者基本数据类型，只能存对象的地址

    2. Collection当中的常用方法
        boolean add(Object e) 往集合中增加元素
        int size() 获取集合中的元素个数
        void clear() 清空集合
        boolean contains(Object o) 看当前集合中是否包含元素o
        boolean remove(Object o) 删除集合中的o元素
        boolean isEmpty() 判断集合是否为空
        Object[] toArray() 将集合转换成数组
 */
public class CollectionTest01 {
    public static void main(String[] args) {
//        Collection c 接口无法new对象
        Collection c = new ArrayList(); //多态，父类型引用指向子类型对象
        //测试Collection当中的常用方法
        //1. add方法
        c.add(1200); //自动装箱，实际上放的是Integer的内存地址
        c.add(3.14);
        c.add(new Student());
        //2. size方法
        System.out.println("集合中元素的个数是" + c.size());
        //3. clear方法
        c.clear();
        c.add("Hello");//存的是Hello字符串的内存地址
        c.add("Ironman");
        //4.contains方法
        boolean flag = c.contains("Ironman");
        System.out.println(flag);
        boolean flag2 = c.contains("Spider-man");
        System.out.println(flag2);
        System.out.println("集合中元素的个数是" + c.size());
        //5. remove方法
        c.remove("Hello");
        System.out.println("集合中元素的个数是" + c.size());
        //6. is empty方法
        c.clear();
        System.out.println(c.isEmpty());//true
        //7. toArray()
        c.add("123");
        c.add("abc");
        c.add("def");
        c.add(new Student());
        Object[] objects = c.toArray();
        for (int i = 0; i < objects.length; i++) {
            Object o = objects[i];
            System.out.println(o);//Object的toString
        }



    }
}

class Student {

}
