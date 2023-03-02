package de.tu_ilmenau.javase.producerAndConsumer;

import java.util.ArrayList;
import java.util.List;

/*
    使用wait和notify方法实现生产者和消费者
    生产和消费线程达到平衡，生产线程负责生产，消费线程负责消费
    wait和notify都是建立在synchronized的基础之上的
    o.wait()和o.notify()都是Object类当中的方法

    模拟这样一个需求
        仓库我们采用List集合，假设只能存一个元素，如果仓库为0表示空，仓库为1表示满
 */
public class ThreadTest {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        //创建2个线程
        Thread t1 = new Thread(new Producer(list));
        Thread t2 = new Thread(new Consumer(list));

        t1.setName("生产者");
        t2.setName("消费者");

        t1.start();
        t2.start();
    }
}

//生产线程
class Producer implements Runnable {
    //仓库
    private List list;

    public Producer() {
    }

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
            if (list.size() > 0 ) {
                //当前线程进入等待状态,并且释放掉占有的list的锁
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                Object obj = new String("产品");
                list.add(obj);
                System.out.println(Thread.currentThread().getName() + "生产 --> " + obj);
                //现在要唤醒消费者了
                list.notify(); //这里执行完，锁也释放了

            }
            }
        }
    }
}
class Consumer implements Runnable {
    private List list;

    public Consumer() {
    }

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() == 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    //进行消费，仓库中有数据
                    Object obj = list.remove(0); //通过0下标
                    System.out.println(Thread.currentThread().getName() + "消费 --> " + obj);
                    list.notify(); //这一步执行完，锁就释放了
                }
            }
        }
    }
}
