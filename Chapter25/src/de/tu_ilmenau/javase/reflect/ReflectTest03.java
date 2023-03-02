package de.tu_ilmenau.javase.reflect;

import java.io.FileReader;
import java.util.Properties;

/*
    通过IO流读取properties配置文件
    反射机制的优点就是不用改动代码了，可以做到不同对象的实例化，十分灵活，符合oct开闭原则
    对扩展开放，对修改关闭

    后期学习的是高级框架，工作过程中也是使用高级框架 包括ssh， ssm等
    Spring SpringMVC MyBatis...
    学会了反射机制有利于你理解婆媳框架底层的源代码
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        // 通过IO流读取classinfo.properties文件
        FileReader reader = new FileReader("Chapter25/classinfo.properties");
        //创建属性类对象Map Properties
        Properties pro = new Properties();
        //加载,load里面是一个流
        pro.load(reader);
        //通过key获取value
        String className = pro.getProperty("className");
//        System.out.println(className);

         // 以后只要改动配置文件就完事了~
        // 通过反射机制实例化对象
        Class c = Class.forName(className); //forName里面的是一个字符串
        Object obj = c.newInstance();
        System.out.println(obj);

    }

}
