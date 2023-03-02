package de.tu_ilmenau.javase.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    日志工具
 */
public class Logger {
    public static void log(String msg) {
        try {
            //标准输出流指向一个文件
            PrintStream out = new PrintStream(new FileOutputStream("log.txt",true)); //不覆盖
            System.setOut(out);

            //改写时间的输出格式
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);

            System.out.println(strTime + " : " + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
