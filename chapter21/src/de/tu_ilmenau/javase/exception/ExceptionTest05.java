package de.tu_ilmenau.javase.exception;
/*
    两种方式处理
    1. 声明
    2. try...catch
 */
public class ExceptionTest05 {
    //第二种方式
    public static void main(String[] args) { //第一种方式 public static void main(String[] args) throws ClassNotFoundException
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }//
    }

    public static void doSome() throws ClassNotFoundException {
        System.out.println("do some!");
    }
}
