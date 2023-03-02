package de.tu_ilmenau.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//  通过反射，反编译一个类的属性Field，这里提取的是类的属性！！不是对象的
// 只要给我一个class文件我就可以全部拿到对应的属性，牛批！！！
// 锻炼一下拼接字符串的能力
public class ThreadTest06 {
    public static void main(String[] args) throws Exception{
        //创建一个String Builder拼接字符串
        StringBuilder s = new StringBuilder();

        s.append("public class Student { \n");
//        s.append("\n");
        Class studentClass = Class.forName("java.lang.Thread");
        Field[] fields = studentClass.getDeclaredFields(); //获取类里面的所有Field
        for (Field f: fields
             ) {
            s.append("\t" + Modifier.toString(f.getModifiers()) + " " + f.getType().getSimpleName() + " " + f.getName() + ";\n");
        // 拿修饰符 Modifer.toString(f.getModifiers())

        }
        s.append("}");
        System.out.println(s);


    }
}
