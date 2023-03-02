package de.tu_ilmenau.javase.thread;
/*
    合理的中止
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //通过标记的方式中止run方法的运行
        //想中止就修改称为false就行
        r.run = false;
    }
}

class MyRunnable4 implements Runnable {
    boolean run = true; //打布尔标记
    @Override
    public void run() {

            for (int i = 0; i < 10; i++) {
                if (run) {
                    System.out.println(Thread.currentThread().getName() + " --> " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else {
                    //这里就可以在return之前保存数据
                    return;
                }

            }


    }
}