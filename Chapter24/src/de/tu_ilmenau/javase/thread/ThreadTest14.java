package de.tu_ilmenau.javase.thread;
/*
    守护线程
 */
public class ThreadTest14 {
    public static void main(String[] args) {
        Thread t = new BackDataThread();
        t.setName("Background");
        //setDaemon在main主线程结束以后自动中止，即使是死循环
        t.setDaemon(true);
        t.start();

        //现在希望main线程结束，分线程也结束
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

class BackDataThread extends Thread{
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName() + " --> " + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}