package de.tu_ilmenau.javase.thread;
/*
    关于线程的sleep方法 static void sleep(long millisecond)
    1. 静态方法
    2. 参数是毫秒
    3. 作用：当前线程进入休眠，进入阻塞状态，放弃占有的cpu时间片
        这段代码出现在哪段线程，哪段线程就进入阻塞状态
    4. Thread.sleep()方法可以让程序每隔特定的一段时间执行代码
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        /*try {
            Thread.sleep(1000 * 5);//睡眠5秒钟
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("猪宝宝一二");*/
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            //隔1秒运行下一次循环
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
