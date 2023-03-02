package de.tu_ilmenau.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    JDK5.0后推出的新特性，泛型
    泛型是在编译阶段起作用
    泛型的作用：
        1. 集合存储的元素类型统一
        2. 从集合中取出的元素是泛型指定的类型，不需要大量的向下转型

    泛型的缺点？
        存储的元素缺乏多样性
    但是大多数的业务中，集合存储的元素类型都是统一的，所以泛型应用也是比较广泛的

 */
public class GenericTest01 {
    public static void main(String[] args) {
        //不使用泛型，程序的缺点
      /*  List myList = new ArrayList();

        Cat c = new Cat();
        Bird b = new Bird();

        myList.add(c);
        myList.add(b);

        //遍历集合 取出cat，让它抓老鼠，取出bird让它飞
        Iterator it = myList.iterator();
        while (it.hasNext()) { //通过迭代器取出来的都是Object，没有Animal
            Object obj = it.next();
            if (obj instanceof Cat) {
                ((Cat) obj).catchMouse();
            }
            if (obj instanceof Bird) {
                ((Bird) obj).fly();
            }
        }*/
        /*
            使用JDK新特性，泛型
         */
        //使用泛型Animal，表示该List当中只允许存储Animal类型的数据
        List<Animal> myList = new ArrayList<Animal>();
//        myList.add(new Cat());//可以存储Animal的子类，用了泛型以后集合中的元素更加统一了
        Cat c = new Cat();
        Bird b = new Bird();
        myList.add(c);
        myList.add(b); //c和b都是Animal的子类

        //表示迭代器迭代的就是Animal类型
        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()) {
            Animal a = it.next();
            a.move();//这里默认取出来的就是Animal对象了，不是Object了，不需要强转了
        }
    }
}
class Animal {
    public void move() {
        System.out.println("animal is moving!");
    }
}

class Cat extends Animal{
    public void catchMouse() {
        System.out.println("catch mouse");
    }
}

class Bird extends Animal{
    public void fly() {
        System.out.println("fly");
    }
}
