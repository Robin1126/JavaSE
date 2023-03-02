package de.tu_ilmenau.javase.thread;

import java.sql.SQLOutput;
/*
    在下面的程序中，在main方法中的sleep能让分程序休眠吗？
        实际测试不会休眠
        分析：因为sleep是静态方法，跟谁调用没关系，在哪个线程就是让哪个线程休眠
        所以这里是休眠5s之后，hello world打印出来
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        Thread t = new MyThread3();
        t.setName("t");
        t.start();

        //调用sleep方法
        try {
            t.sleep(1000 * 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello World");
    }
}
class MyThread3 extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}