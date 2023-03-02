/*
    hashCode方法：
        在Object中的hashCode方法是怎样的？
            public native int hashCode();
            不是抽象方法，带有native关键字，底层调用c++程序

         hashCode()方法返回的是哈希码
            实际上就是一个java对象的内存地址，经过哈希算法，最后得出的一个值
            所以hashCode（）方法的执行结果可以等同看作一个Java对象的内存地址
 */
public class Test07 {
    public static void main(String[] args) {
        Object o = new Object();
        int hashCodeValue = o.hashCode();

        System.out.println(hashCodeValue);

        Myclass mc = new Myclass();
        int hashCodeValue2 = mc.hashCode();
        System.out.println(hashCodeValue2);
    }
}
class Myclass{

}