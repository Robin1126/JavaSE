package de.tu_ilmenau.javase.IO;

import java.io.FileOutputStream;
import java.io.PrintStream;

/*
    printStream:标准的字节输出流，默认输出到控制台
 */
public class PrintStreamTest {
    public static void main(String[] args) throws Exception {
        System.out.println("hello world!");

        //System.out是一个静态变量，它的类型是PrintStream
        PrintStream ps = System.out;
        ps.println("hello zhangsan");
        ps.println("hello zky");
        ps.print("hello yier!");
        //标准输出流不需要close
        //可以改变标准输出流的输出方向吗？可以
        /**
         * 之前使用过的System类的方法和属性
         * System.gc()
         * System.currentTimeMillis();
         * PrintStream ps2 = System.out; 这个是静态属性
         * System.exit(0) 退出jvm方法
         * System.arraycopy(源数组，开始位置，目标数组，开始位置，长度);
         */
        //System.setOut和PrintStream的都是包装类，后面要跟一个OutputStream的子类
        PrintStream printStream = new PrintStream(new FileOutputStream("log")); //标准输出流指向log文件
        System.setOut(printStream); //修改输出方向，标准输出流不再输出到控制台，而是输出到log文件
        System.out.println("hello bubu!");
        System.out.println("hello lbb!");
        //上面两个就不输出到控制台了，而是输出到文件里面去了
    }
}
