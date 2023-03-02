package de.tu_ilmenau.javase.thread;
/*
    如何半道上唤醒睡眠的Thread？
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();

        //主线程
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //中断t的睡眠，让它回来干活
        t.interrupt(); //interrupt 一盘冷水过去
        //这种中止睡眠的方式是引起异常机制 InterruptedException
    }
}
class MyRunnable2 implements Runnable {
    //不能throws，子类不能给父类抛出更多的异常，所以这里只能try...catch
    //因为run方法在父类中没有抛出异常
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "---> begin");
        try {
            Thread.sleep(1000 * 3600); //睡眠1小时
        } catch (InterruptedException e) {
            e.printStackTrace();
            e.getMessage();
        }
        System.out.println(Thread.currentThread().getName() + "---> end");

    }
    //其他方法可以throws
}