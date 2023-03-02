package de.tu_ilmenau.javase.integer;
/*
    构造方法有两个
    1. Integer（int）
    2. Integer (String) 这里的字符串也必须是int范围内
 */
public class IntegerTest03 {
    //java9以后不建议使用
    public static void main(String[] args) {
        Integer x = new Integer(100);
        System.out.println(x);
        Integer y = new Integer("123");
        System.out.println(y);
        Integer z = new Integer("2147483647"); //必须在int的范围内 -2147483648 ~ 2147483647
        System.out.println(z);

        Double d1 = new Double(1.23);
        Double d2 = new Double("1.233");



    }


}
