/*
    接口的基础语法：
        1.类和类之间叫做继承，类和接口之间叫实现
        别多想：实现也可以看作是一种继承
        继承用extends
        实现用implements关键字完成

        2.当一个非抽象类实现接口的话，必须将接口当中的抽象方法全部实现（覆盖，重写）
        3.编程的时候都是面向抽象编程的，运行的时候运行的是底层对象的方法
 */
public class Test02 {
    public static void main(String[] args) {
        MyMath m = new Egal();
        int result1 = m.sum(1,2);
        int result2 = m.sub(3,1);
        System.out.println(result1);
        System.out.println(result2);
    }
}

//完全抽象的类，叫做接口
interface MyMath {
    double PI = 3.14;
    int sum(int a, int b);
    int sub(int a, int b);
}
//编写一个类，非抽象类
class Egal implements MyMath {
    @Override
    public int sum(int a, int b) { //如果不写public系统会尝试赋予private，Override 权限更低是不可以的
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
abstract class ABC implements MyMath {
    //抽象方法可以直接implements接口没有问题
}