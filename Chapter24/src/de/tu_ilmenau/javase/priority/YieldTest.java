package de.tu_ilmenau.javase.priority;
/*
    Yield静态方法让位，回到就绪状态
 */
public class YieldTest {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        for (int i = 1; i <= 10000 ; i++) {
            System.out.println(Thread.currentThread().getName() + " --> " + i);
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            if(i % 100 == 0)
            {
                Thread.yield();//当前线程每100次让位一次
            }
            System.out.println(Thread.currentThread().getName() + " --> " + i);
        }
    }
}
