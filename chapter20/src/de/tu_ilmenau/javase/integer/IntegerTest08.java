package de.tu_ilmenau.javase.integer;
/*
    String,int,Integer互相转换
 */
public class IntegerTest08 {
    public static void main(String[] args) {
        //string int
        String s1 = "123";
        int i1 = Integer.parseInt(s1);
        String s2 = String.valueOf(i1);
        s2 = i1 + "";//直接转换就可以了

        //string and Integer
        Integer I1 = Integer.valueOf(s1);
        String s3 = String.valueOf(I1); //String.valueOf(Object obj)

        //int and Integer 自动拆装箱就够用了
        Integer I2 = Integer.valueOf(i1);
        int i2 = I2.intValue();
    }
}
