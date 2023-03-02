package de.tu_ilmenau.javase.string;
/*
    String的常用构造方法
 */
public class StringTest04 {
    public static void main(String[] args) {
        //创建字符串对象最常用的构造方法
        String s1 = "123";

        //常用的构造方法
        //转换byte数组
        byte[] bytes = {97, 98, 99};//当传入的参数是byte数组的时候，unicode转换成为字符串，然后拼接
        String s2 = new String(bytes);
        System.out.println(s2);//String类已经重写了toString方法
        //输出一个引用的适合，会自动调用toString方法

        //如果byte数组很长，你只是想转换一部分
        String s3 = new String(bytes,1,2);//从bytes数组的下标1开始，长度为2，因此输出的是bc
        System.out.println(s3);

        //将char数组全转换成字符串
        char[] chars = {'猪','宝','宝','很','笨','哦','!'};
        String s4 = new String(chars);
        System.out.println(s4);

        //将char数组部分转换
        String s5 = new String(chars, 0, 3);
        System.out.println(s5);

        //直接传入String参数
        String s6 = new String("布布");
        System.out.println(s6);

    }



}
