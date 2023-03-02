package de.tu_ilmenau.javase.thread;
/*
    分析这个程序欧多少个线程，除了gc线程以外
    就1个线程，都是一个栈，都是自上而下逐行进行的

    main begin!
    m1 begin
    m2 begin
    m3 begin
    m3 over
    m2 over
    m1 over
    main over
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println("main begin!");
        m1();
        System.out.println("main over");
    }

    public static void m1() {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");

    }

    private static void m3() {
        System.out.println("m3 begin");
        System.out.println("m3 over");
    }
}
