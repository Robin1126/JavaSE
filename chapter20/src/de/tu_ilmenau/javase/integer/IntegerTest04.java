package de.tu_ilmenau.javase.integer;

import java.sql.SQLOutput;

/*
    通过访问包装类的常量，来获取最大最小值
 */
public class IntegerTest04 {
    public static void main(String[] args) {
        System.out.println("int的最大值是：" + Integer.MAX_VALUE);
        System.out.println("int的最小值是：" + Integer.MIN_VALUE);
        System.out.println("byte的最大值是：" + Byte.MIN_VALUE);
        System.out.println("byte的最小值是：" + Byte.MAX_VALUE);
        System.out.println("short的最大值是：" + Short.MAX_VALUE);
        System.out.println("short的最小值是：" + Short.MIN_VALUE);
    }
}
