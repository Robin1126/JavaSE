package de.tu_ilmenau.javase.string;
/*
关于Java JDK中内置的一个类：java.lang.String
    1. String表示字符串类型，属于引用数据类型，不属于基本数据类型
    2. 在Java中随便使用双引号括起来的都是String类型的对象
    3. Java中规定，双引号括起来的字符串，是不可变的，也就是说“abc”从出生到死亡都是“abc”
    4. JDK中双引号括起来的字符串，都是存放在方法区的字符串常量池当中的
        为什么要怎么做呢？
            因为字符串在实际开发当中使用太频繁，为了程序的效率而规定的
 */
public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "abcdef" + "xy"; //这里用上面的对象，和新建的xy拼接，然后生成新的abcdfxy再用s2指向它
        //这两行代码表示底层创建了3个对象

        String s3 = new String("xy"); //这里的xy是从上面拿的
        //因为这里用的是new，在堆内存当中有一个String对象，里面有一个地址0x5656，0x5656是方法区xy的地址，然后main方法中的s3保存的是堆内存对象的地址
        //！！！相当于 栈内存中的s3->堆内存中的String->方法区中常量池xy！！！
    }
}
