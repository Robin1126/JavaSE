package de.tu_ilmenau.javase.priority;
/*
    void join()方法可以让当前线程阻塞，等待对应的线程完成了之后，再执行当前线程
 */
public class JoinTest01 {
    public static void main(String[] args) {
        System.out.println("main begin");

        Thread t = new Thread(new MyRunnable01());
        t.setName("t");
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //完成了分线程才会输出这一句
        System.out.println("main over");
    }
}

class MyRunnable01 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " --> " + i);
        }
    }
}