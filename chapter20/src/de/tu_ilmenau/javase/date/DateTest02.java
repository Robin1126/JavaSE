package de.tu_ilmenau.javase.date;
/*
    获取自从 1970年1月1日 0时0分0秒 000到现在的毫秒数
    使用System.currentTimeMillis();
 */
public class DateTest02 {
    public static void main(String[] args) {
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);

        /*int i = Integer.MAX_VALUE;
        System.out.println(i);*/
        long t1 = System.currentTimeMillis();
        print();
        long t2 = System.currentTimeMillis();
        System.out.println("print的耗费时间是：" + (t2 - t1) + "毫秒");
    }
    public static void print() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("i = " + i);
        }
    }
}
