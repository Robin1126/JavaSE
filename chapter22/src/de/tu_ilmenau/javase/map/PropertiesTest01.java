package de.tu_ilmenau.javase.map;

import java.util.Map;
import java.util.Properties;

/*
    目前只需要掌握Porperties属性类相关的方法即可
    Properties是一个Map集合，继承Hashtable,Properties的key和value都是String类型，因此被称为属性类对象
    Porperties是线程安全的
    Properties的中重点方法：
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties pro = new Properties();

        //存
        pro.setProperty("url","https://www.google.com");
        pro.setProperty("username","bubu");
        pro.setProperty("password","123");

        //通usernamelue
        String url = pro.getProperty("url");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");

        System.out.println("url=" + url);
        System.out.println("username=" + username);
        System.out.println("password=" + password);
    }
}
