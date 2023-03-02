package de.tu_ilmenau.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static de.tu_ilmenau.javase.exception.ExceptionTest06.m2;
import static de.tu_ilmenau.javase.exception.ExceptionTest06.m3;

/*
    异常对象的两个方法：
        1. String msg = exception.getMessage();
        2. e.printStackTrace();

    我们应该怎么看异常最终信息，可以快速调试错误呢？
        先看错误是什么，这里是FileNotFoundException
        然后从上往下看，看自己写的类，一行一行看
        但是注意的是，sun写的代码就不用看了
 */
public class ExceptionTest09 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();//实际开发中，建议使用这个，养成好习惯，出问题才能知道
            /*
        java.io.FileNotFoundException: C:\Users\luobi\Desktop\JavaSE每章作业\005-异常作业\day27作业.txt (系统找不到指定的路径。)
	    at java.base/java.io.FileInputStream.open0(Native Method)
	    at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
	    at de.tu_ilmenau.javase.exception.ExceptionTest09.m3(ExceptionTest09.java:32)
	    at de.tu_ilmenau.javase.exception.ExceptionTest09.m2(ExceptionTest09.java:28)
	    at de.tu_ilmenau.javase.exception.ExceptionTest09.m1(ExceptionTest09.java:25)
	    at de.tu_ilmenau.javase.exception.ExceptionTest09.main(ExceptionTest09.java:17)
             */
        }
        System.out.println("1234567,走南闯北吃东西");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }
    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("C:\\Users\\luobi\\Desktop\\JavaSE每章作业\\005-异常作业\\day27作业.txt");
    }
}
