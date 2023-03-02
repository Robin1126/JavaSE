package de.tu_ilmenau.javase.exception;
/*
    1. 什么是异常，异常有什么用？
        以下在执行过程中发生了不正常的情况，而这种不正常的情况叫做异常
        java是很完善的语言，提供了异常的处理方式。以下情况，java将异常信息打到控制台当中，让程序员参考解决。程序员看到以后可以对程序进行修改，让程序更加完善。
    2. 异常信息是由jvm打印出来的
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b == 0) {
            System.out.println("除数不能为0");
            return;
        }
        int c = a / b; //ArithmeticException
        System.out.println(a +  "/" + b + "=" + c);
    }
}
