package de.tu_ilmenau.javase.integer;
/*
    这个是Integer很重要的面试题
 */
public class IntegerTest06 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
        /*
            java中为了提高效率，将-128到127之间的所有包装对象，提前创造好，放到了方法区的整数型的常量池
            如果要的变量是这里面的是，是直接取出来的，不会再new对象了。
            池：256个对象，cache就是缓存机制。
            缓存优点：效率高 缓存缺点：耗费内存。在大型内存当中使用缓存可以大幅提升效率
            一些固定的，经常访问的东西直接从缓存拿，不需要从数据库里面查询了
         */
        Integer x = 127;
        Integer y = 127;
        System.out.println(x == y); //
    }
}
