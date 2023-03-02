package de.tu_ilmenau.javase.thread;
/*
    实现多线程的第二种方式，编写一个类实现Java.lang.Runnable接口
        同样这个类里面也要重写一个run方法
    然后Thread t = new Thread（runnable对象）
    后面仍然是t.start()

    第二种方式是最好的，它是面向接口的，也就是说它可以继承别的类~ 更加灵活
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        //创建一个可运行的对象
        //将可运行的对象封装称为一个线程对象，调用了Thread的构造方法
        Thread t = new Thread(new MyRunnable());
        //启动线程
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程-->" + i);
        }
    }
}

//这并不是一个线程类，是一个可运行的类。它还不是一个线程
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程-->" + i);
        }
    }
}