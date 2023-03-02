package de.tu_ilmenau.javase.reflect;

import java.lang.reflect.Method;

/*
    通过反射机制怎么调用方法？
    java中区分一个方法靠的是方法名和形参

    反射机制，让代码很有通用性，可变的内容都是写到配置当中的，将来修改配置文件之后，创建的对象不一样了，调用的方法也不同了，但是代码不需要改动
 */
public class ThreadTest10 {
    public static void main(String[] args) throws Exception {
        // 使用反射机制来调用方法
        Class userService = Class.forName("de.tu_ilmenau.javase.service.UserService");
        //创建对象
        Object object = userService.newInstance();
        //获取方法
        Method loginMethod = userService.getDeclaredMethod("login",String.class,String.class); //class类型
        //调用方法
        //要素1：对象userService 要素2：login方法名 要素3：实参列表 要素4：返回值
        Object retValue = loginMethod.invoke(object,"admin","123");
        //这个非常重要！！！！方法.invoke（对象，参数）
    }
}
