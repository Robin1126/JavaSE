package de.tu_ilmenau.javase.annotation;

public class AnnotationTest03 {
    public static void main(String[] args) {
        AnnotationTest03.doSome(); //这里就会显示一条横线，表示已经过时或者不推荐使用

    }
    @Deprecated
    public static void doSome() {
        System.out.println("do some");
    }

    public static void doOther() {
        System.out.println("do other");
    }
}
