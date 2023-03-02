package de.tu_ilmenau.javase.priority;
/*
    void setPriority(int newPriority) 设置线程优先级
    int getPriority() 获取线程优先级
    最低优先级1，最高优先级10，默认优先级5

    static void yield() 静态方法，暂停执行当前的线程对象，并执行其他线程
    让位是让线程从运行状态回到就绪状态，
    注意！！也有可能在就绪状态抢到位置，又回来执行了~

    实例方法 void join() 合并线程
 */
public class PriorityTest01 {
    public static void main(String[] args) {
        System.out.println("最高优先级是：" + Thread.MAX_PRIORITY);
        System.out.println("最低优先级是：" + Thread.MIN_PRIORITY);
        System.out.println("平均优先级是：" + Thread.NORM_PRIORITY);

        MyPriority myPriority = new MyPriority();
        Thread t = new Thread(myPriority);
        t.setName("t");
        t.setPriority(10);
        Thread.currentThread().setPriority(1);
        t.start();
        //大概率是优先优先级高的
        System.out.println(Thread.currentThread().getName() + "的优先级是： " + Thread.currentThread().getPriority());

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " --> " + i);
        }

        /*try {
            Thread.sleep(1000 * 6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
//        myPriority.run = false;

    }
}

class MyPriority implements Runnable {
    boolean run = true;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "的优先级是：" +Thread.currentThread().getPriority());
//        Thread.yield();
        for (int i = 0; i < 1000; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + " --> " + i);
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }else {
                return;
            }

        }
    }
}

class MyThread1 extends Thread {
    public void doSome() {
        Thread t = new MyThread2();
        try {
            t.join(); //当前线程阻塞，等待t线程执行完毕，这个线程才继续
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MyThread2 extends Thread {

}
