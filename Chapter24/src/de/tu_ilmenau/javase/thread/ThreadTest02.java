package de.tu_ilmenau.javase.thread;
/*
    实现线程的第一种方式：
        编写一个类，直接继承java.lang.Thread这个类，并且在类当中重写thread方法

        如何创建线程对象? new对象就可以了
        如何启动线程？ 调用线程对象的start（）方法

        注意：
            亘古不变的道理，java程序遵循自上而下的运行原则，上一条代码不执行完，永远不会执行下一条代码

        注意到控制台的输出
            有多有少
            有先有后 原因是控制台只有一个，而且cpu的时间分配片不一样

 */
public class ThreadTest02 {
    public static void main(String[] args) {
        //这里是main方法，代码属于主线程，在主栈当中运行
        //新建一个分支线程对象
        MyThread mt = new MyThread();
        //启动线程
        //start()方法的作用是在内存当中开辟一个新的栈空间，开完空间就瞬间结束
        //启动成功的线程会自动调用run方法，并且run方法在新建的分支栈的底部，压栈
        //run在分支栈的底部，main在主栈的底部
        mt.start();
        //注意不能 mt.run() 这样就不是开辟新的栈空间了，就变成单线程了
        //这里的代码还是运行在主线程中
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程-->" + i);
        }
    }
}
// 这是一个线程类
class MyThread extends Thread {
    @Override
    public void run() {
        //编写程序，运行在分支栈中
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程 -->" + i);
        }
    }
}
