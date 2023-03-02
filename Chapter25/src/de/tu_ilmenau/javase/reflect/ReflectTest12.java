package de.tu_ilmenau.javase.reflect;

import java.lang.reflect.Constructor;

/*
比上一个例子重要一些
getDeclaredConstructor(String.class, int.class); 得到构造方法
 */
public class ReflectTest12 {
    public static void main(String[] args) throws Exception {
        Class vip = Class.forName("de.tu_ilmenau.javase.service.VIP");
        Object obj = vip.newInstance(); //无参构造
        System.out.println(obj);

        //拿到构造方法
        Constructor con = vip.getDeclaredConstructor(String.class, int.class);
        //调用构造方法
        Object newObj = con.newInstance("lbb",110);
        System.out.println(newObj);
        //拿到无参构造
        Constructor none = vip.getDeclaredConstructor();
        Object newObj1 = none.newInstance();
        System.out.println(newObj1);

    }
}
