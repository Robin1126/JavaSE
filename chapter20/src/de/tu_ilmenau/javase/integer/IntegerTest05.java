package de.tu_ilmenau.javase.integer;
/*
    在JDK1.5之后支持自动拆箱和拆箱
 */
public class IntegerTest05 {
    public static void main(String[] args) {
        Integer x = 100;//自动装箱 Integer x = new Integer(100);
        int y = x;//自动拆箱 int y = x.intValue();

        Integer z = 1000;
        System.out.println(z+1); //自动开箱，加减乘除才会开

        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b); //保存的对象内存地址不同，==号是不会自动拆箱的
    }



}
