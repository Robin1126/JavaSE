package de.tu_ilmenau.javase.exception;
/*
    1. java语言中异常是以什么形式存在的？
       在程序的执行过程中，当jvm发现了异常，那他会在发生异常的语句后面new一个异常对象，然后将异常抛出
    2. 异常对应的现实生活中是怎么样的？
        比如 火灾=异常类，小明家发生了火灾=异常对象
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        //从异常类实例化异常对象
        NumberFormatException nef = new NumberFormatException("数字格式化异常");
        System.out.println(nef);



        //空指针异常
        NullPointerException npe = new NullPointerException("空指针异常发生！");
        System.out.println(npe);
    }
}
