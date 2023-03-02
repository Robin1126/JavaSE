/*
    java语言当中的字符串string有没有重写toString方法，有没有重写equals方法
 */
public class Test03 {
    public static void main(String[] args) {
        //大部分情况下，以这样的方式创建字符串对象
        String s1 = "abc";
        String s2 = "def";
        //也可以这样新建字符串
        String s3 = new String("Test1");
        String s4 = new String("Test2");
        System.out.println("s1 和 s2 的比较结果:" + (s1 == s2));//现在比较变量貌似可以直接用==比较了，前提是不是new出来的
        System.out.println(s3 == s4);//比较两个字符串不能用双等号
        System.out.println(s3.equals(s4));//sun公司已经重写过String中的equals
        System.out.println(s1.equals(s2));//比较两个字符串用equals方法

        String x = new String("Powernode");
        System.out.println(x.toString());//经过测试，String类已经重写了toString方法
        System.out.println(x);//只要是类都有toString和equals方法，肯定也有构造方法
    }
}
