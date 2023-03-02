package de.tu_ilmenau.javase.thread;

/**
 * 1.怎么获取当前线程对象？ static currentThread()静态方法
 * 2. 获取线程对象的名字 线程对象.getName()
 * 3.修改线程对象的名字 setName()
 * 4.当线程没有名字，默认Thread-0。。。
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        //获取当前线程
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());

        //创建线程对象
        MyThread2 t1 = new MyThread2();
        t1.setName("t1");
        //设置线程的名字
        //t.setName("yier");
        //获取线程的名字
        /*String tName = t.getName();
        System.out.println(tName);*/
        //启动线程

        MyThread2 t2 = new MyThread2();
        t2.setName("t2");
        t1.start();
        t2.start();
//        System.out.println(t2.getName());

        /*for (int i = 0; i < 1000; i++) {
            System.out.println(");
        }*/
    }
}

class MyThread2 extends Thread {
    public void run(){
        for (int i = 1; i < 1001; i++) {
            //当t1线程执行run方法，那么这个线程就是t1
            //当t2线程执行run方法，那么这个线程就是t2
            Thread currentThread = Thread.currentThread(); //谁执行这段代码，这个就是谁
            System.out.println(currentThread.getName() + "-->" + i);
        }
    }
}