package de.tu_ilmenau.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
反编译构造方法
 */
public class ReflectTest11 {
    public static void main(String[] args) throws Exception{
        Class vip = Class.forName("de.tu_ilmenau.javase.service.VIP");
        StringBuilder s = new StringBuilder();

        //public class VIP {}
        s.append(Modifier.toString(vip.getModifiers()));
        s.append(" ");
        s.append(vip.getSimpleName());
        s.append("{\n");
        //构造方法列表
        Constructor[] constructors = vip.getConstructors();
        for (Constructor constructor: constructors
             ) {
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(vip.getSimpleName());
            s.append("(");
            //参数列表
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType: parameterTypes
                 ) {
                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            if (parameterTypes.length > 0) {
                s.deleteCharAt(s.length() - 1);
            }
            s.append("){}\n");
        }
        s.append("}");
        System.out.println(s);
    }
}
