package de.tu_ilmenau.javase.exception;
/*
    异常对象有两个重要的方法
        获取异常简单的描述信息：
        String msg = exception.getMessage();

        打印异常追踪的堆栈信息：
            exception.printStackTrace();


 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        NullPointerException e = new NullPointerException("空指针异常"); //这个就是异常信息，构造的时候传进去的
        //因为没有throw，所以后面的还会处理 如果throws
//        throw e; //throw是手动抛异常
        String msg = e.getMessage();
        System.out.println(msg);

        //打印异常堆栈信息
        e.printStackTrace(); //另外一个线程负责处理，不一定在helloworld的上面，异步处理
        //Java后台打印异常堆栈追踪信息的时候，采用了异步线程的方式打印

        System.out.println("Hello World");
    }
}
