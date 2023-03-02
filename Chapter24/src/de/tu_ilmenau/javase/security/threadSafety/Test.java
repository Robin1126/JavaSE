package de.tu_ilmenau.javase.security.threadSafety;

import de.tu_ilmenau.javase.security.Account;
import de.tu_ilmenau.javase.security.AccountThread;

public class Test {
    public static void main(String[] args) {
        de.tu_ilmenau.javase.security.Account act = new de.tu_ilmenau.javase.security.Account("act001", 10000.0);
        de.tu_ilmenau.javase.security.Account act2 = new Account("act002", 20000.0);
        Thread t1 = new de.tu_ilmenau.javase.security.AccountThread(act);
        Thread t2 = new de.tu_ilmenau.javase.security.AccountThread(act);
        Thread t3 = new AccountThread(act2);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        //启动取款
        t1.start();
        t2.start();
        t3.start();

    }
}
