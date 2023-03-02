package com.bjpowernode.javase.chapter17;
import java.util.Scanner; //直接引入包
//"C:\Program Files\Java\jdk-17.0.1\lib\src.zip\java.base\java\ util" <-util的包在这里
public class Test03 {
    public static void main(String[] args) {
        //因为Test03的类和Scanner这个类不在一个包下
        //前面这个包就是Java.util就是包的名字
        //java.util.Scanner s = new java.util.Scanner(System.in);
        Scanner s = new Scanner(System.in);
        String str = s.next();
        java.lang.String str1 = "lbb";
        System.out.println("name is " + str1);
        System.out.println("您输入的字符串是：" + str);

    }
}
