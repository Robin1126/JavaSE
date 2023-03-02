package de.tu_ilmenau.javase.annotation5;

import java.lang.annotation.Annotation;

/*
    注意Retention中的属性必须是RetentionPolicy.Runtime才能被反射机制使用
 */
public class ReflectAnnotationTest {
    public static void main(String[] args) throws Exception {
        // 获取类
        Class c = Class.forName("de.tu_ilmenau.javase.annotation5.MyAnnotationTest");
        // 判断类上面是否有注解
        System.out.println(c.isAnnotationPresent(MyAnnotation5.class)); //true
        if (c.isAnnotationPresent(MyAnnotation5.class)) {
            MyAnnotation5 myAnnotation5 =(MyAnnotation5)c.getAnnotation(MyAnnotation5.class); //类上的Annotation需要转型
            System.out.println("类上面的注解对象：" + myAnnotation5);
            //获取注解对象的属性
            String value = myAnnotation5.value();
            System.out.println(value);
        }
        // 判断String类上面是否有这个注解
        Class stringClass = Class.forName("java.lang.String");
        System.out.println(stringClass.isAnnotationPresent(MyAnnotation5.class)); // false String类上面显然没有我们的自定义注解

    }
}
