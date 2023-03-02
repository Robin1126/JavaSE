package de.tu_ilmenau.javase.map;

import java.util.HashSet;
import java.util.Set;

/*
    内部类
 */
public class MyClass {
    private static class InnerClass{
        public static void m1() {
            System.out.println("m1 doing");
        }
        //内部类动态方法，需要创建对象调用
        public void m2() {
            System.out.println("m2 doing");
        }


    }

    public static void main(String[] args) {
        MyClass.InnerClass.m1(); //调用内部类方法

        MyClass.InnerClass mi = new MyClass.InnerClass();
        mi.m2();

        //给一个set集合，存储该类型
        Set<InnerClass> set = new HashSet<>();
        Set<MyMap.MyEntry<Integer,String>> set1 = new HashSet<>(); //其实就是内部类还有一个泛型！
    }
}

class MyMap {
    public static class MyEntry<K,V>{ }
}
