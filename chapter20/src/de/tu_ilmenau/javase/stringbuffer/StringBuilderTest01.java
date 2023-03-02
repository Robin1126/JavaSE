package de.tu_ilmenau.javase.stringbuffer;
/*
    Stringbuffer和StringBuilder的区别
        StringBuffer中含有synchronized表示StringBuffer在多线程运行中是安全的,线性安全
        StringBuilder中不含有synchronized表示StringBuilder在多线程运行中不安全，非线性安全

    到时讲多线程就理解了
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //一样的效果
        sb.append("111");
        sb.append("abc");
        System.out.println(sb);
    }
}
