package de.tu_ilmenau.javase.reflect;

import java.io.FileReader;

/*
    研究路径的问题
    之前路径的缺点L:一直都是IDEA的工程中，移植性差
 */
public class AboutPath {
    public static void main(String[] args) throws  Exception {
//        FileReader reader = new FileReader("Chapter25/classinfo.properties");
        // 这个代码离开了IDEA那么根目录就改变了，就不通用了

        //接下来说一种比较通用的路径，即使代码换位置了，这样编写仍然是通用的
        //注意：以下代码通用方式：这个文件必须在类路径下
        // 什么叫做类路径下？方式在src下的都是类路径下
        // src是类的根路径
        /*
            getContextClassLoader() 是线程对象的方法，获得的是线程的类加载器对象
            getResource() 是类加载器的方法，当前线程的类加载器默认从类的根路径下加载资源
            采用这种方法获得的就是绝对路径，这种方式是通用的
            使用类加载器去找资源，从src下面
         */
        String s = Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath();
        System.out.println(s);
        // 从类的src作为起点
        String s1 = Thread.currentThread().getContextClassLoader().getResource("de/tu_ilmenau/javase/bean/db.properties").getPath();
        System.out.println(s1);
//       FileReader reader = new FileReader(s);
    }
}
