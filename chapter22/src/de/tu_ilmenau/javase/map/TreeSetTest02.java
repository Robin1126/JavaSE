package de.tu_ilmenau.javase.map;

import java.util.TreeSet;

/*
    对于自定义的类来说，TreeSet可以排序吗？
    不能直接排序，因为谁大谁小没有说明
    class de.tu_ilmenau.javase.map.Person cannot be cast to class java.lang.Comparable

    出错的原因是强制类型转换，没有实现java.lang.Comparable接口


 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();

        Person p1 = new Person(11);
        System.out.println(p1);

        Person p2 = new Person(26);
        Person p3 = new Person(35);
        Person p4 = new Person(30);

        ts.add(p2);
        //ts.add(p3);
        //ts.add(p4);
        for (Person p: ts
             ) {
            System.out.println(p);
        }
    }
}

class Person {
    int age;
    public Person(int age){
        this.age = age;
    }
    public String toString() {
        return String.valueOf(this.age);

    }
}
