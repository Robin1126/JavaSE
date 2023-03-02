package de.tu_ilmenau.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    处理异常的第一种方式：使用关键字throws抛给调用者
    注意：
        只要异常没有捕捉，采用上报的方式，此方法的后续代码不会执行
        另外需要注意，try语句块中的某一行出现异常，那么后续语句也不会执行
        try..catch捕捉异常后，后面的语句可以正常执行
 */
public class ExceptionTest06 {
    public static void main(String[] args) {
        System.out.println("main begin");
        /*
            一般main方法中的异常使用try...catch来自己解决
            因为再往上抛就会导致jvm结束程序，不符合我们设计程序要求的健壮性

            然而像是100/0这种算术异常，你可以管也可以不管，编译器都不会有意见
         */
//        System.out.println(100 / 0);
        try {
            m1();
            System.out.println("run"); //m1出异常就到cat语句了，这一句不执行
        } catch (FileNotFoundException e) { //catch后面好像一个方法的形参，这个e是个引用，保存的是异常对象的地址
            System.out.println("文件不存在，可能路径有误，也可能文件已经被删除");
            System.out.println(e.getMessage());//C:\Users\luobi\Desktop\JavaSE每章作业\005-异常作业\day27作业.txt (系统找不到指定的路径。)
            System.out.println(e);//toString()方法
        }
        System.out.println("main over");
    }

    public static void m1() throws FileNotFoundException{ //Exception, IOException{ Exception是终极父类,也可以使用多个异常，逗号隔开
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }
    public static void m2() throws FileNotFoundException { //IOException可以因为它是FileNotFoundException的父类
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");//如果m3方法出异常了，那么这一句不会执行，直接返回上一级了
        //上报就相当于提前结束了！！！
    }
    //报错是因为有一个异常没有解决
    // 这里调用了一个构造方法，这个构造方法声明位置上有throws FileNotFoundException
    //这个异常是一个编译时异常，要求程序员预处理，没有预先处理编译就会报错
    public static void m3() throws FileNotFoundException {
        //调用sun某个类的构造方法
        //后期IO流用的，后面就知道了

        //我们采用第一种方式解决
        new FileInputStream("C:\\Users\\luobi\\Desktop\\JavaSE每章作业\\005-异常作业\\day27作业.txt");
    }
}
