package de.tu_ilmenau.javase.security.exam.exam2;
/*
    doOther的执行需要等待doSome方法的结束吗？
        现在Myclass创造了两次，两把锁，就不用排队了，t1和t2用的不是同一个对象
 */
public class Exam01 {
    public static void main(String[] args) {
        Myclass mc1 = new Myclass();
        Myclass mc2 = new Myclass();
        Thread t1 = new MyThread(mc1);
        Thread t2 = new MyThread(mc2);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();


    }
}

class MyThread extends Thread {
    private Myclass mc;
    public MyThread(Myclass mc) {
        this.mc = mc;
    }

    public void run() { //不同的线程启用不同的方法
        if (Thread.currentThread().getName().equals("t1")) {
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")) {
            mc.doOther();
        }
    }

}
class Myclass {
    public synchronized void doSome() {
        System.out.println("doSome begin!");
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome end!");
    }
    public synchronized void doOther() {
//        synchronized (this) 这样就锁住了，这里t2也需要等对象mc唯一的令牌空闲出来
        System.out.println("doOther begin!");
        System.out.println("doOther end!");
    }
}
