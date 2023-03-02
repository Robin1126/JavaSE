package de.tu_ilmenau.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    JDK之后引入了：自动类型推断机制（又称为钻石表达式）
 */
public class GenericTest02 {
    public static void main(String[] args) {
        List<Animal> myList = new ArrayList<>(); //后面的可以不写，现在可以自动推断
        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());

        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()) {
            Animal a = it.next();
            a.move();
        }

        List<String> strList = new ArrayList<>();
        strList.add("lbblovezky");
        strList.add("bjpowernode");

        Iterator<String> it1 = strList.iterator();
        while (it1.hasNext()) {
            String s = it1.next();
            String sub = s.substring(7); //zky 和 node
            System.out.println(sub);
        }
    }
}
