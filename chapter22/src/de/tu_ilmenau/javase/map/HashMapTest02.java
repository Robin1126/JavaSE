package de.tu_ilmenau.javase.map;

import java.sql.Struct;
import java.util.HashSet;
import java.util.Set;
/*
    1. key的hashcode方法返回哈希值，如果对应的数组下标位置上为空，那就直接插入，不需要调用equals方法
       所以当每个元素的哈希值都不一样的时候，就不需要调用equals方法

    2. 如果一个类的equals方法重写了，那么它的hashCode同样要重写！！

    3. HashCode和equals直接IDEA生成！不用去管了~

    4. 放在HashMap的key部分和放在HashSet集合中的元素，需要同时重写equals和HashCode方法

    5. 在JDK8之后，如果一个单向链表的元素大于8个，单向链表这种数据结构会变成红黑树
       当红黑树上的节点小于6，就会变回单向链表的结构。 目的是为了增加存储检索的效率
 */
public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1 = new Student("bubu");
        Student s2 = new Student("bubu");
        System.out.println(s1.equals(s2));

        //由于没有重写HashCode调用的是Object的HashCode
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());//由于HashCode没重写，它们的哈希值不一样，因此在HashSet的数组中的下标不一样，因此存进去两个！
        //但是这样其实是不对的，因为set的要求是无序，不可重复，这里就相当于key重复了~
    }
}
