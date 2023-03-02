package de.tu_ilmenau.javase.exception;

public class ExceptionTest04 {
    public static void main(String[] args) {
        //main调用doSome方法
        //因为doSome方法声明的位置上有throws
        //如果不处理，就会报错
        //doSome();//未处理的异常，编译器会报错
    }

    /**
     * doSome方法在方法声明的位置上声明了异常
     * 叫做类没找到异常。这个异常是Exception的子类，属于编译时异常
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException {
        System.out.println("do Some");
    }
}
