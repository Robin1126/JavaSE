package de.tu_ilmenau.javase.collection;

import java.util.*;

/*
    java.util.collection 集合接口
    java.util.collections 集合工具类，方便集合的操作

    常用方法：
    1. Collections.sort(List<T> list) 要求排序的类当中实现comparable接口或者有comparator，而且必须是个list才行
        目前学过的list有ArrayList，LinkedList，Vector
    2. 还可以使用Collections.sort(List<T> list, Comparator)
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.synchronizedList(list); //将不是线程安全的list转换成线程安全的

        list.add("bubu");
        list.add("yier");
        list.add("lbb");
        list.add("zky");

        //排序
        Collections.sort(list);
        for (String s: list
             ) {
            System.out.println(s); //按照字典排序
        }

        List<Pig> pig = new ArrayList<>();
        pig.add(new Pig(2,100));
        pig.add(new Pig(3,50));
        Collections.sort(pig);

        for (Pig p: pig
             ) {
            System.out.println(p);
        }

//        Collections.sort(zhu); 不能排序，因为没有comparable或者comparator方法

        //由于不能直接排Set集合，那么我们可以考虑将Set转换为List以后再进行排列
        Set<String> set = new HashSet<>();
        set.add("bubu");
        set.add("yier");
        set.add("zky");
        set.add("lbb");

        //转换成list
        List<String> myList = new ArrayList<>(set);
        Collections.sort(myList);
        //遍历
        for (String s1 : myList
             ) {
            System.out.println(s1);
        }
    }
}
class Pig implements Comparable<Pig>{
    private int age;
    private double weight;

    public Pig(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Pig o) {
        return (int) (this.getWeight() - o.getWeight());
    }
}
