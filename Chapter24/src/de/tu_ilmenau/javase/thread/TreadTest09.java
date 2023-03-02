package de.tu_ilmenau.javase.thread;
/*
    在java中如何强行中止一个线程
    1. stop()方法，直接杀线程，有可能会丢失数据
 */
public class TreadTest09 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable3());
        t.setName("t");
        t.start();

        //模拟5秒钟
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5s之后，干掉这个线程
        //缺点： 强行关闭，可能会丢失数据
        t.stop();

    }
}
class MyRunnable3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " --> " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
