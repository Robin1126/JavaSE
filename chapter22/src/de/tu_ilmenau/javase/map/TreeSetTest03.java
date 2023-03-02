package de.tu_ilmenau.javase.map;
/*
    自定义的类一定要实现Comparable<T>的接口
    并且重写public int compareTo(T obj)方法
    如果需要打印出来，还要重写String toString()方法
 */
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        TreeSet<Customer> ts = new TreeSet<>();

        Customer p1 = new Customer(11);
//        System.out.println(p1);

        Customer p2 = new Customer(26);
        Customer p3 = new Customer(35);
        Customer p4 = new Customer(30);

        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        //遍历
        for (Customer p: ts
        ) {
            System.out.println(p);
        }
    }
}
//equals可以不写
class Customer implements Comparable<Customer> {
   int age;
   public Customer(int age) {
       this.age = age;
   }

    @Override
    //在这个方法中编写比较的逻辑和规则
    public int compareTo(Customer c) {
       return this.age - c.age; // =0 >0 <0 升序
//        return c.age - this.age; 这就是降序排列了
    }
    public String toString() {
       return "Customer[age=" + this.age + "]";
    }
}

