package de.tu_ilmenau.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    深入try...catch
    1. catch后面的小括号可以写具体的类型，也可以写该异常类型的父类型
    2. catch可以写多个，建议一个个精确处理，有利于程序员的调试
    3. catch写多个的时候遵循从上到下，从小到大

    看你想让谁处理来选择使用throws还是用try...catch
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        try {
            //创建输入流
            System.out.println(100 / 0);
            FileInputStream fis = new FileInputStream("C:\\Users\\luobi\\Desktop\\JavaSE每章作业\\004-异常作业\\day27作业.txt") ;
            fis.read();
        } catch (FileNotFoundException | ArithmeticException e) { //写IOException也没有问题，因为多态，父类型对象指向子类型
            System.out.println("文件不存在? 运算异常?");
        } catch (IOException e) {
            System.out.println("读文件报错");
        }
        System.out.println("Hello Lbb");
    }

}
