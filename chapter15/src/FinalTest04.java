/*
    final修饰的实例变量
    final修饰的实例变量，必须手动赋值
    重点！final修饰的变量，只能赋值一次
    所以一般实例变量不加final，如果要加就将它加上static升级到类级别，以节省空间

    终极结论：static final联合修饰的变量称为常量！！
    变量名全部字母大写，单词之间用_连接

    实际上 常量和静态变量一样，区别在于常量不能变。
    两者都是存在方法区，并且在类加载的时候完成初始化。

    常量一般都是公开的，因为公开了你也改不了，无所谓
    比如 public static final int no = 9527;
 */

public class FinalTest04 {
    public static void main(String[] args) {
        System.out.println(Chinese.COUNTRY);
    }
}
class Chinese{
    String idCard;
    String name;
    //国家的值是一个固定值，中国
    final static String COUNTRY = "中国"; //fianl修饰的必须手动赋值，而且赋值一次以后不能改变
    //一个对象一份变量country，浪费堆内存空间
    //final修饰的实例变量一般添加static修饰改成静态变量，这样就不用存在堆内存当中了，节省空间
    //将他上升到类级别
}
class MyMath {
    public static final double pi = 3.1415926;

}