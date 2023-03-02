package com.bjpowernode.javase.chapter17;
public class Test01 {
    public static void main(String[] args) {
        com.bjpowernode.javase.chapter17.HelloWorld hw = new com.bjpowernode.javase.chapter17.HelloWorld();
        System.out.println(hw);
        //com.bjpowernode.javase.chapter17.HelloWorld@2f92e0f4 输出对象的哈希16进制位置

        HelloWorld hw2 = new HelloWorld();
        System.out.println(hw2);//com.bjpowernode.javase.chapter17.HelloWorld@28a418fc
    }
}
