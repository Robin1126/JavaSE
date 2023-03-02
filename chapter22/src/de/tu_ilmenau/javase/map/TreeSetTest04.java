package de.tu_ilmenau.javase.map;

import java.util.Comparator;
import java.util.TreeSet;

/*
    TreeSet集合中使用比较器来排序
    最终结论：
        放到TreeSet或者TreeMap集合中的元素要想排序
            1. 放在集合中的元素实现java.lang.comparable接口
            2. 在构造TreeSet/TreeMap的时候传入一个比较器对象
                这个比较器对象可以使用匿名内部类或者新建一个类去实现Comparator<Object> 同样可以运用泛型

            那么应该使用comparable还是用comparator呢？
                当比较规则只有一个或者比较不容易改变的时候，直接在类的地方实现comparable接口，如果需要多次比较或者切换比较方式的时候，使用Comparator
 */
public class TreeSetTest04 {
    public static void main(String[] args) {
        TreeSet<Animal> ts = new TreeSet<>(new Comparator<Animal>() { //匿名内部类也可以！
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.age - o2.age;
            }
        });
        TreeSet<Animal> ts1 = new TreeSet<>(new AnimalComparator());//要将一个比较器传进去

        Animal a1 = new Animal(1000);
        Animal a2 = new Animal(800);
        Animal a3 = new Animal(1200);
        Animal a4 = new Animal(600);

        ts.add(a1);
        ts.add(a2);
        ts.add(a3);
        ts.add(a4);
        //打印出来就是按照年龄排序的
        for (Animal a: ts
             ) {
            System.out.println(a);
        }

    }
}
class Animal {
    int age;
    public Animal(int age) {
        this.age = age;
    }
    public String toString() {
        return "Animal's age = " + this.age;
    }


}
//单独编写一个比较全欧
// 比较器实现java.util.Comparator接口 注意：Comparable是java.lang下面的，Comparator是java.util包下面的
// 同样也是看比较器跟零的比较

class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        //指定比较规则
        return o1.age - o2.age;
    }
}
