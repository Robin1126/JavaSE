package de.tu_ilmenau.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
    反射method, java.lang.reflect.Method
 */
public class ReflectTest08 {
    public static void main(String[] args) throws Exception {
        Class userService = Class.forName("de.tu_ilmenau.javase.service.UserService");

        //获取类所有的方法
        Method[] methods = userService.getDeclaredMethods();

        //遍历Method
        for (Method method: methods
             ) {
            //获取方法名
            System.out.println(method.getName());
            //获取返回值类型
            System.out.println(method.getReturnType().getSimpleName());
            //获取方法的参数列表？返回的应该是一个类别
            //因为一个数组有多个参数
            Class[] types = method.getParameterTypes();
            for (Class type: types
                 ) {
                System.out.println(type.getSimpleName());
            }
            //获取方法的修饰符列表
            System.out.println(Modifier.toString(method.getModifiers()));
        }
    }
}
