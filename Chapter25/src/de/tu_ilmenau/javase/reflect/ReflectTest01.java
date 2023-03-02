package de.tu_ilmenau.javase.reflect;

import java.util.Date;

/*
    要操作字节码必须先获取到字节码，怎么获取java.lang.Class实例？
        三种方式
        1. Class c = Class.forName("完整的类名带包名")；
        2. Class c = 对象.getClass();
        3. Class c = 任何类型.class;
 */
public class ReflectTest01 {
    public static void main(String[] args) throws Exception {
        /*
            就是不操作java编写的语言了，直接对底层的字节码动刀子！！
            Class.forName()
                1. 静态方法
                2. 方法的参数是一个字符串
                3. 字符串需要一个完整的类名
                4. 完整类名必须带有包名。java.lang包也不能省略
         */
        Class c1 = Class.forName("java.lang.String"); //现在c1就代表了整个String类了
        Class c2 = Class.forName("java.util.Date");
        Class c3 = Class.forName("java.lang.Integer");
        Class c4 = Class.forName("java.lang.System");
        /*
            第二种方法：Object中自带一个getClass()方法
         */
        String s = "abc";
        Class x = s.getClass(); //s是String的一个对象，所以getClass就直接拿到了String.class文件
        System.out.println(c1 == x);//true 是同一个class。判断的是内存地址，实际上就是main栈里面的c1指向了方法区的字节码
        //字节码文件装载到方法区的时候只有一份

        Date time = new Date();
        Class y = time.getClass();
        System.out.println(y == c2); //ture 都指向方法区当中的字节码文件

        Integer i = 123;
        Class z = i.getClass();
        System.out.println(z == c3);
        /*
            第三种方式：java语言中任何一种类型，包括基本数据类型，他都有.class属性

         */
        Class k = Date.class;
        Class f = int.class;
        Class b = String.class;
        System.out.println(k == c2);
        System.out.println(b == c1);
    }
}
