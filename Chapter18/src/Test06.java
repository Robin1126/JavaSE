/*
    关于Object当中的finalize（）方法
        1. 在object类当中的源代码
            protected void finalize() throws Throwable ()

        2. finalize()方法只有一个方法体，里面没有代码，且这个方法是protected修饰的，最多用到子类当中

        3. 这个方法不需要程序员手动调用，JVM的垃圾回收器负责调用
           finalize()只需要重写，GC自动调用这个方法

        4. finalize（）方法的执行时机
            当一个java对象即将被销毁的时候，调用finalize（）

        5. 实际上是一个时机，如果程序员希望垃圾销毁的时候执行一段代码的话，就执行finalize（）

        6. 静态代码块
            static { 代码块;}
            静态代码块在类加载时刻执行，并且只执行一次
            finalize（）同样也是类似的功能。类似于临终的行为。

        7. 不是一定启动的，垃圾太少或者时间不到可能不启动的

 */
public class Test06 {
    public static void main(String[] args) {
       /* Person p = new Person();
        p = null; //对象就回收了，没变量指向它了
        */
        /*for (int i = 0; i < 1000000; i++) {
            Person k = new Person();
            k = null;
        }*/

        //建议GC启动 System.gc()启动
        Person p = new Person();
        p = null;
        System.gc();
    }
}
class Person{
    //对象被回收的时候，垃圾回收器调用p.finalize()
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + "即将被销毁！"); //Person@465cfa49即将被销毁！类名+地址
    }
}
