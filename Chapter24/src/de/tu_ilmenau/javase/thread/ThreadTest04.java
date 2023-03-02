package de.tu_ilmenau.javase.thread;
/*
    采用匿名内部类可以吗?
        可以，直接在Thread（）里面new一个接口，在接口后面重写run方法，IDEA会自动补全代码的
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() { //直接new接口，一个没有名字的类new出的对象
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("分线程-->" + i);
                }
            }
        });
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程-->" + i);
        }
    }
}
