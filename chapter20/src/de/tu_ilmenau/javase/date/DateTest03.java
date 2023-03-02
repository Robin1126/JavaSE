package de.tu_ilmenau.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        Date time = new Date(100000000);
        //从1970年1年1月1日0时0分0秒以来的毫秒数目
        //按照格林威治时间来的根据时区来算的

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String time1 = sdf.format(time);
        System.out.println(time1);

        //想获取昨天的时间怎么办？ 使用currentTimeMillis
        Date time2 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        String time3 = sdf.format(time2);
        System.out.println(time3);

        //获取去年今日的时间
        Date time4 = new Date(System.currentTimeMillis() - 1000L * 60 * 60 * 24 * 365); //这里要用long类型
        String time5 = sdf.format(time4);
        System.out.println(time5);
    }
}
