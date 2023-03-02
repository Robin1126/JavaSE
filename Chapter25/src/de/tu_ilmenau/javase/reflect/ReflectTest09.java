package de.tu_ilmenau.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
    Method的反编译
    现在的水平只能反编译method的签名，内容还反编译不出来
 */
public class ReflectTest09 {
    public static void main(String[] args) throws Exception {
        Class userService = Class.forName("de.tu_ilmenau.javase.service.UserService");
        StringBuilder s = new StringBuilder();
        s.append(Modifier.toString(userService.getModifiers()) + " class " + userService.getSimpleName() + " {\n" );
        //反编译修饰符
        Method[] methods = userService.getDeclaredMethods();
        for (Method method: methods
             ) {
            s.append("\t");
            s.append(Modifier.toString(method.getModifiers()));
            s.append(" ");
            s.append(method.getReturnType().getSimpleName());
            s.append(" ");
            s.append(method.getName());
            s.append(" ( ");
            //参数列表
            Class[] C = method.getParameterTypes();
            for (Class c: C
                 ) {
                s.append(c.getSimpleName());
                s.append(",");
            }
            s.deleteCharAt(s.length() -1 ); //最后的一个逗号去掉，删除指定下标上的char
            s.append(")");
            s.append("{ }\n");
        }
        s.append("}");
        System.out.println(s);

    }
}
