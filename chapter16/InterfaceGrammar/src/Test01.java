/*
    接口：
        1. 接口也是一种引用数据类型
        2. 接口是完全抽象的（接口是特殊的抽象类）抽象类是半抽象的
        3. 接口怎么定义？语法是什么
            【 修饰符列表 】 interface 接口名 { }
            【 修饰符列表 】 abstract class 类名 { }
        4. 接口编译之后也是一个字节码文件，也生成class文件
        5. 接口是可以继承接口的，并且支持多继承
           interface C extends A,B
        6. 接口中只包含两部分内容，一部分是常量，一部分是抽象方法。
        7. public abstract 修饰符在接口当中是可以省略的，因为必定是抽象方法。
           接口中的方法因为是抽象方法，不能带有方法体。
           public static final 修饰符也是可以省略的，因为常量都在接口当中
           在接口当中随便写的都是常量
        8. 接口中的所有元素都是public修饰的，公开的

 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(MyMath.PI);
    }
}
//
/*
interface A {

}
interface B {

}
interface C extends A,B {

}
*/
/*
interface MyMath {
    double PI = 3.14;
    int sum(int a, int b);
    int sub(int a, int b);
}*/
