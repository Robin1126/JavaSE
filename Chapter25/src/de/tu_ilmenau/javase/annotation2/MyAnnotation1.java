package de.tu_ilmenau.javase.annotation2;

public @interface MyAnnotation1 {
    /**
     * 我们通常在注解当中可以定义属性，以下是Annotation的name属性
     * 看着像一个方法，但实际上我们称之为属性name
     */
    String name();
    String color();
    int age() default 25;
}
