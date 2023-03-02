package de.tu_ilmenau.javase.stringbuffer;
/*
    String为什么不可变?
       1. String中有一个byte数组，这个byte数组采用了final修饰符，因为数组的长度一旦创建不可改变，并且被final修饰的引用一旦指向某个对象之后，
        就不可再指向其他对象，所以String是不可变的
       2. StringBuffer内部实际上是一个byte数组，这个byte数组没有被final修饰，一开始默认容量是16，当超出这个范围的时候，会调用System.arraycopy（）扩容，
       更适合字符串的频繁拼接。
       3. StringBuilder跟StringBuffer都一样，
 */
public class StringBufferTest04 {
    public static void main(String[] args) {
        String s = "abc";
        s = "xyz";//字符串不可变是说abc放到了字符串常量池当中
        final String s1 = "abc"; //这样就锁死了s1不能指向别的对象了

    }
}
