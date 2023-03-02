/*
    匿名内部类：
        1. 什么是内部类？
            内部类：类的内部又定义了一个新的类

        2. 内部类的分类
            静态内部类：类似静态变量
            实例内部类：类似实例变量
            局部内部类：类似于局部变量

        3. 使用内部类编写的代码可读性很差，能不用尽量不用

        4. 匿名内部类是局部内部类的一种。
           因为这个类没有名字而得名，叫做匿名内部类

        5. 主要是能读懂别人的代码，但不建议这样写，因为有2个缺点
            1. 没有名字不能重复使用
            2. 可读性太差，代码很乱

 */
public class Test01 {
    static String country;
    static class Inner1{

    }

    class Inner2 {

    }

    public void doSome() {
        int i = 100;
        class Inner3 { //Inner3在doOther中不能用，它是局部的

        }
    }
    public void doOther() {

    }

    public static void main(String[] args) {
        //调用Mymath中的mysum方法
        Mymath mm = new Mymath();
        mm.mysum(new ComputeImpl(),100,200);//接口是new不了的,所以要把这个接口用个类实现再new

        //使用匿名内部类可以不在外面编写一个实现类了
        //匿名内部类用于传入参数中有接口的情况
        //缺点：这个类只能用一次，而且代码太乱，可读性太差
        //逼格高
        Mymath m = new Mymath();
        m.mysum(new Compute() {  //这个大括号就代笔了这个类的实现，new接口后面加一个大括号，实际上并不是接口new，后面的大括号代表了接口的实现
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        },200,300);
    }
}
//interface
interface Compute{
    int sum(int a, int b);
}
class ComputeImpl implements Compute{ //多态，运行的时候调用这个方法
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
//数学类
class Mymath{
    public void mysum(Compute c, int x, int y){
        int value = c.sum(x,y); //调用接口，然后把x，y传进c的sum方法中
        System.out.println(x + "+" + y + "=" + value);
    }
}