package de.tu_ilmenau.javase.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.Timer;
import java.util.TimerTask;

/*
    使用定时器指定定时任务schedule
    schedule(TimerTask task, Date firstTime, long period) 安排指定任务在指定的时间开始进行重复的固定延迟执行
    period是毫秒数
    Timer可以起名字，可以daemon作为后台，Timer也是一个线程
 */
public class TimerTest {
    public static void main(String[] args) throws Exception {
        Timer timer = new Timer("lbb",false);

        //使用定时器指定定时任务
        //timer.schedule(定时任务，第一次执行时间，间隔多久执行一次);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2023-02-25 15:13:00");//将字符串改成时间格式
//        timer.schedule(new LogTimerTask(), firstTime, 1000*10);
        timer.schedule(new TimerTask() { //使用匿名内部类也没有问题
            @Override
            public void run() {
                System.out.println("111");
            }
        }, firstTime, 1000 * 10);
    }
}

//编写一个定时任务类 TimerTask是一个抽象类，只能继承
class LogTimerTask extends TimerTask {
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String current = sdf.format(new Date());
        System.out.println(current + "执行了备份操作");
    }
}
