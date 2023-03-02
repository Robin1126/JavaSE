/*
    final是修饰符，加载public，private等后面
        1. final是Java语言当中的一个关键字。

        2. final表示最终的，不可变的。

        3. final可以修饰变量以及方法，还有类等。

        4. final修饰的变量？
           final修饰的变量无法被重新赋值
           final修饰的变量只能被赋一次值

        5. final修饰的方法？
           final修饰的方法无法被覆盖和重写


        6. final修饰的类？
           final修饰的类无法继承

        提示：final不管能不能调用的问题，与调用无关

    注意：String类无法被继承，因为SUN公司写了final在String的代码中
 */

public class FinalTest01 {
    public static void main(String[] args) {
        //局部变量
        int i = 100;
        //重新赋值
        i = 200;

        //局部变量
        final int k;
        k = 100;
        //k = 300; final修饰的变量一旦赋值，就被定死了，无法被重新赋值
    }
}

final class A {

}
//B类继承A类，相当于B对A进行了一个扩展
//如果不希望别人继承，那么给A加个关键字，绝育~ 就不能扩展了
//final class A 也就不允许别的类进行方法重写了~
/*
class B extends A {

}
*/
class C {
    public final void doSome() {
        System.out.println("C's dosome...");
    }
}

class D extends C {
    /*public void doSome() {
        System.out.println("D's dosome...");
    }*/
    //final的方法无法被override
}


