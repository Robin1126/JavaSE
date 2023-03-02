package de.tu_ilmenau.javase.reflect;
/*
    给你一个类，获得这个类的父类和实现的接口
 */
public class ReflectTest13 {
    public static void main(String[] args) throws Exception {
        Class stringClass = Class.forName("java.lang.String");

        //获取String的父类
        Class superClass = stringClass.getSuperclass();
        System.out.println(superClass.getSimpleName());

        //拿接口
        Class[] interfaces = stringClass.getInterfaces();
        for (Class c: interfaces
             ) {
            System.out.println(c.getName());
        }

    }
}
