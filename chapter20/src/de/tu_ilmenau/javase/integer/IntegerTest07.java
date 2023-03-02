package de.tu_ilmenau.javase.integer;
/*
    总结一下至今的异常：
        1. 空指针异常 NullPointerException
        2. 类转换已成 ClassCastException
        3. 数组下标异常 ArrayIndexOutOfBoundsException
        4. 数字格式化异常 NumberFormatException

    常用的方法：
        Interger(int x) 和 x.intValue()

     Integer，int，String的互相转换
     int -> Integer: 自动装箱，Integer.valueOf(123)
     Integer -> int: 自动拆箱，intValue()
     int -> String: 直接加双引号"123"，String.valueOf(int)
     String -> int: Integer.parseInt("123")
     String -> Integer: Integer.valueOf("123")
     Integer -> String: String.valueOf(Integer对象，其实就是Object对象)
 */
public class IntegerTest07 {
    public static void main(String[] args) {
        Integer x = new Integer(1000);
        int y = x.intValue();//手动拆，手动装
        System.out.println(y);

        Integer x1 = new Integer("123"); //要求字符串里面的int要在范围里面-2147483648 到2147483648
        //否则会出现java.Lang.NumberFormatException

        //重点方法
        //static int parseInt(String s)
        //静态方法，输入string返回int
        //网页上输入的数字实际上是一个字符串，但后台要的是数字，java程序就要用对应的方法转换成为数字
        int retValue = Integer.parseInt("123");//区分intValue Integer对象方法
        System.out.println(retValue + 100);
        //同样也有 Double.parseDouble("3.14");
        float retValue3 = Float.parseFloat("1.01");
        System.out.println(retValue3 + 1);

        //以下内容作为了解，不需要掌握
        //静态方法，将十进制转换为二进制
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString);

        String hexString = Integer.toHexString(15);
        System.out.println(hexString);

        String octalString = Integer.toOctalString(8);
        System.out.println(octalString);

        //valueOf方法 静态的
        //从int和string类型转换成为Integer类型
        //static Integer valueOf(int) 一般用这个创建Integer对象
        // static Integer valueOf(String s)
        Integer i1 = Integer.valueOf(16);
        Integer i2 = Integer.valueOf("456");
    }
}
