package de.tu_ilmenau.javase.security;
/*
     银行账户
        使用线程同步机制，解决线程安全问题
 */
public class Account {
    private String actno;
    private double balance;

    //实例变量
    Object obj = new Object(); //accout对象是共享的，那么它里面的属性obj也是独一份的，也可以作为共享对象
    //都是独一份的
    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款的方法withdraw
    /*
        线程同步机制的语法是：
            synchronized() {
                语法块;
            }
            synchronized后面的小括号中传的这个“数据”是相当关键的
            这个数据必须是多线程共享的数据，才能达到多线程排队

            （）中写什么，要看你想让哪些线程排队
            假设有t1，t2，t3排队，t4，t5不排队
            那么在括号中只写t1，t2，t3共享的对象

            这里共享的对象是账户对象，就是this

            在Java语言当中，任何对象都有一把锁，其实就是一个标记
            100个对象，100把锁，synchronized就是给上锁

            以下代码的执行原理？
                1. t1和t2线程并发，开始执行以下代码的时候，肯定有一个先一个后
                2. 假设t1先执行，遇到了synchronized，这个时候自动找后面共享对象的对象锁，占有这把锁，直到同步代码块执行结束，这把锁才释放
                3. t2来到synchronized，发现锁被t1占用了，必须等到t1执行完归还这把锁，才能开始执行

            注意！ 这个共享对象一定要选好，谁要排队的，那就选它们共享的对象
     */
    public void withdraw(double money){
        //注意！以下的代码必须一个线程执行完毕以后，另一个线程才可以执行
//        synchronized ("abc") 这么写的话所有的线程都会同步,因为这个是在字符串常量池当中，所有对象都共享的，跟account无关
        //不要想那么多，只要看你要求排队的线程共享的对象，这里写了abc就相当于一个公共厕所了，不是对应楼层的厕所
        synchronized (obj){ //这里填写需要共享的对象
        double before = this.getBalance();
        double after = before - money;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(after);
        }
    }
}
