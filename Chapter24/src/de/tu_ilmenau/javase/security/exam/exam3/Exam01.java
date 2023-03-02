package de.tu_ilmenau.javase.security.exam.exam3;
/*
    doOther的执行需要等待doSome方法的结束吗？
        对象改成了静态的方法，就相当于类上了锁，t2就必须等t1运行完了
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
    public synchronized static void doSome() {
        System.out.println("doSome begin!");
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome end!");
    }
    public synchronized static void doOther() {
//        synchronized (this) 这样就锁住了，这里t2也需要等对象mc唯一的令牌空闲出来
        System.out.println("doOther begin!");
        System.out.println("doOther end!");
    }
}
