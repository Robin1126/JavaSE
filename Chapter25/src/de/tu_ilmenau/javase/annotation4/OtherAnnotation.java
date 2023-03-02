package de.tu_ilmenau.javase.annotation4;

public @interface OtherAnnotation {
    int age();
    String[] email();
    Season[] seasonArray(); //Season是一个枚举类型！
}
