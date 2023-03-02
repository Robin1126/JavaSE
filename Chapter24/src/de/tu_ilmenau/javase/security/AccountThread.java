package de.tu_ilmenau.javase.security;

public class AccountThread extends Thread{
    //两个线程必须共享同一个账户对象
    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }
    public void run() {
        //run方法可以执行提款操作
        //假设取款5000
        double money = 5000.0;
        this.act.withdraw(money);
        System.out.println(Thread.currentThread().getName() + "取款 ");
        System.out.println("账户" + act.getActno() + "取款成功，剩余余额" + act.getBalance());
    }
}
