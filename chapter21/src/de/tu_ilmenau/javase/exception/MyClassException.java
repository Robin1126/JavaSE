package de.tu_ilmenau.javase.exception;
/*
    sun公司定义的Exception不够用，如何自定义呢？

    如果定义？
        1. 编写类继承Exception或者是RuntimeException
        2. 提供两个构造方法，一个无参数，一个有参数String s
 */
public class MyClassException extends Exception {
    public MyClassException() {
    }

    public MyClassException(String s) {
        super(s);
    }
}

