package de.tu_ilmenau.javase.annotation6;

import java.lang.reflect.Method;

public class MyAnnotationTest6 {
    @Annotation6(username = "lbb", password = "4567")
    public static void doSome() {

    }

    


    public static void main(String[] args) throws Exception {
        Class c = Class.forName("de.tu_ilmenau.javase.annotation6.MyAnnotationTest6");
        //首先要获取类，然后获取方法
        Method[] method = c.getDeclaredMethods();
        Method doSome = c.getDeclaredMethod("doSome");
        if (doSome.isAnnotationPresent(Annotation6.class)) {
            Annotation6 annotation6 = doSome.getAnnotation(Annotation6.class); //方法上的Annotation不需要转型
            System.out.println(annotation6.username());
            System.out.println(annotation6.password());
        }
    }
}

