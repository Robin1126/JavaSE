package de.tu_ilmenau.javase.annotation2;

import de.tu_ilmenau.javase.annotation.MyAnnotation;

public class MyAnnotationTest {
    //如果一个注解当中有属性，那么必须给属性赋值,加了default之后就可以不写了，有默认值
    @MyAnnotation1(name = "lbb", color = "red")
    public void doSome() {

    }
}
