package de.tu_ilmenau.javase.stringbuffer;
/*
    如果以后需要进行大量字符串的拼接操作，建议使用JDK中自带的
        java.lang.StringBuffer;
        java.lang.StringBuilder;

    如何提高StringBuffer的性能
        预估要使用的大小，预先设定一个合适的StringBuffer大小，减少扩容
 */
public class StringBufferTest02 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        //StringBuffer实际上是一个byte数组，初始化容量16
        stringBuffer.append("a");//append方法拼接字符串,append是追加的意思
        stringBuffer.append('b');

        //
        StringBuffer sb = new StringBuffer(100);//设立初始的StringBuffer大小
        sb.append("hello");
        sb.append("kitty");
        sb.append("!");
        sb.append("zky");
        System.out.println(sb);//toString可以不写
    }
}
