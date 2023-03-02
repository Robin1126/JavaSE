package de.tu_ilmenau.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    关于try..catch中的finally字句
    1. finally语句块子句中的代码是最后执行的，而且是一定会执行的，即使try语句块中的代码出现了异常
        finally语句必须和try一起出现，不能单独出现

    2. finally语句通常使用在哪些情况下？
        通常用于完成资源的释放和关闭
        即使try语句块出现异常，也不影响finally中的语句执行

 */
public class ExceptionTest10 {
    public static void main(String[] args) {
        FileInputStream fis = null; //声明位置放到外面，这样在finally才能用
        try {
            fis = new FileInputStream("C:\\Users\\luobi\\Desktop\\JavaSE每章作业\\004-异常作业\\day27作业.txt");

            String s = null;
            s.toString(); //这里一定会出现空指针异常

//            fis.close(); //流使用完要关闭,这里可能关不了
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        } finally {
            if (fis != null) {
                try {
                    fis.close(); //这里也要异常处理，close方法
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }



        }
    }
}
