package de.tu_ilmenau.javase.reflect;

import java.util.ResourceBundle;

/*
java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容
使用这种方式的时候，属性配置文件必须放到类路径下
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //只能绑定.properties文件，且该文件必须在类路径下
        //getBundle的参数中，不用写properties后缀
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo2"); //后缀properties不用写！
        //也不用流，也不用关闭流
        String className = bundle.getString("className");
        System.out.println(className);

        ResourceBundle bundle1 = ResourceBundle.getBundle("de/tu_ilmenau/javase/bean/db");
        String name = bundle1.getString("name");
        System.out.println(name);
    }
}
