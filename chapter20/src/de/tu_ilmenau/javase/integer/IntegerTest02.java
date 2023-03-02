package de.tu_ilmenau.javase.integer;

/*
    8种基本数据类型对应的包装类型是什么？

    基本数据类型          包装类型
    byte                java.lang.Byte 父类number
    short               java.lang.Short 父类number
    int                 java.lang.Integer 父类number
    long                java.lang.Long 父类number
    float               java.lang.Float 父类number
    double              java.lang.Double 父类number
    boolean             java.lang.Boolean 父类object
    char                java.lang.Character 父类object

    2. 8种其中的6种父类都是number

    3. number是一个抽象类，无法具体化对象

    4. 基本数据类型->引用数据类型（装箱）
       引用数据类型->基本数据类型（拆箱）
 */
public class IntegerTest02 {
    public static void main(String[] args) {
        Integer i = new Integer(123);//这是一个对象，其他类型照葫芦画瓢
        //装箱
        //valueOf(int)


        float f = i.floatValue();//拆箱
        System.out.println(f);

        int retValue = i.intValue();//拆箱
        System.out.println(retValue);


    }
}
