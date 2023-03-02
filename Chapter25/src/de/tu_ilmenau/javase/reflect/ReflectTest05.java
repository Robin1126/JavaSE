package de.tu_ilmenau.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
    反射属性field，在java.util.Reflect里面的Field类
 */
public class ReflectTest05 {
    public static void main(String[] args) throws Exception {
/*        String path = Thread.currentThread().getContextClassLoader().getResource("de/tu_ilmenau/javase/bean/User.class").getPath();
       System.out.println(path);*/
       Class studentClass = Class.forName("de.tu_ilmenau.javase.bean.Student");
       String simpleName = studentClass.getSimpleName();
        System.out.println(simpleName);//简单名字
       // 这里用不了绝对路径
        //getFields()获取的是所有公开的属性
       Field[] fields =  studentClass.getFields();
        System.out.println(fields.length);
        Field f = fields[0];
        String s = f.getName();
        System.out.println(s); //no 是public修饰的
        //获取所有的field
        System.out.println("---------------------------");
        Field[] fs = studentClass.getDeclaredFields();
        System.out.println(fs.length);// 4,全部拿完了


        //以后可以先猜测一下方法，再去查阅文档，效率比较高
        for (Field F: fs //使用循环拿到属性名，属性的类型,
             ) {
            int i = F.getModifiers(); //拿修饰符，返回的是修饰符的代号
            //可以将这个字符串的代号转换成字符串吗？
            //可以，调用Modifier类里面的toString方法
            System.out.print(Modifier.toString(i) + " ");
            System.out.print(F.getType().getSimpleName() + " "); //返回类型的class，再获取name即可，返回属性的类型名
            System.out.println(F.getName()); //返回属性名
        }
    }
}
