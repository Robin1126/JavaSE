package de.tu_ilmenau.javase.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
    实现线程的第三种方式：实现Callable
    有可能会让别的线程阻塞，因为要获得线程运行的结果！
    优点：可以获取线程的运行结果
    缺点：可能会让当前线程阻塞，因为get方法
 */
public class ThreadTest15 {
    public static void main(String[] args) throws Exception{
        //创建一个未来任务类对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                //线程执行一个任务，可能会有一个执行结果
                System.out.println("call method begin");
                Thread.sleep(1000 * 5);
                System.out.println("call method over");
                int a = 100;
                int b = 200;
                return a + b; //Integer对象
            }
        });
        Thread t = new Thread(task); //创建线程对象
        t.start(); //start!
        //如何在main线程中拿到t线程结束的返回值呢？
        Object obj = task.get(); //这个代码的执行等待t线程执行完毕，导致main方法后面的语句受阻
        //get方法是为了拿另一个线程的结果，类似join方法，也是要等待别的程序执行
        System.out.println("Hello World!");

    }
}

