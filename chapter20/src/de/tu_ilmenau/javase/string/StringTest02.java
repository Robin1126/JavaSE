package de.tu_ilmenau.javase.string;

import java.sql.SQLOutput;

//注意！垃圾回收机制是不会回收常量的
public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2); //因为s1和s2存的都是方法区Hello在常量池当中的地址，true

        String s3 = new String("xyz");
        String s4 = new String("xyz");
        System.out.println(s3 == s4);//这个是false，因为s3，s4保存到是对象的地址，但是这两个对象的地址是不一样的，因为都用了new
        //只是这两个对象的保存的xyz的地址一样
        //因此用==判断两个字符串变量是否相等不保险
        System.out.println(s3.equals(s4));//true

        String k = new String("testString");
        System.out.println("testString".equals(k));//建议这样写，这样不会出现空指针异常，true
    }
}
