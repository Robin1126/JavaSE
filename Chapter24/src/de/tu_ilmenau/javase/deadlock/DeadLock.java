package de.tu_ilmenau.javase.deadlock;
/*
    一般面试官都会让你写，只有会写才会注意这个问题
    Synchronized在开发当中不要嵌套使用，容易出现死锁
 */
public class DeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new MyThread1(o1, o2);
        Thread t2 = new MyThread2(o1, o2);

        t1.start();
        t2.start();
    }
}

class MyThread1 extends Thread {
    Object o1;
    Object o2;
    public MyThread1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() { // t1先锁住o1，然后要去锁o2的时候，o2已经被t2锁住了，再等t2释放
        //但是t2同时也在等t1释放锁，所以就僵住了
        synchronized (o1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2) {
                System.out.println("Hello t1!");
            }
        }
    }
}

class MyThread2 extends Thread {
    Object o1;
    Object o2;
    public MyThread2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2) {

            synchronized (o1) {
                System.out.println("Hello t2!");
            }
        }
    }
}