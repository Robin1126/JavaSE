/*
    抽象类：
    1. 抽象类中不一定要有抽象方法，但是抽象方法必须存在于抽象类当中。
    2. 重要结论！！！
        一个非抽象的类继承抽象类，如果抽象类当中有抽象方法，那么必须在非抽象的子类当中重写该方法，将这个抽象方法实现了！
        不然编译器会不通过，这是Java语法强行规定的。

        这里的覆盖或者说重写也可以叫做对抽象的实现。
        如果继承的子类也是一个抽象类，那就可以不用管他了。
 */
public class AbstractTest02 {
    public static void main(String[] args) {
        Animal a = new Bird(); //面向抽象编程，以后调用的时候都是抽象.xxx，向上转型了
        //编译的时候是Animal的，运行的时候是运行Bird，当然了，要有多态也是要继承的
        //a的类型是抽象的，不要面向具体编程，降低程序的耦合度，提高程序的扩展力
        //符合OCP原则
        a.move();

        Animal c = new Cat();
        c.move();

    }
}
//动物类
abstract class Animal {
    public abstract void move();
}
class Bird extends Animal{
    //继承的抽象方法，不能存在在非抽象类当中，因此必须override

    @Override
    public void move() {
        System.out.println("Bird is flying!");
    }
}
class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("Cat is walking!");
    }
}

/*
    有些内容不要死记硬背，讲讲道理
    分析：
        animal是父类，并且是抽象的
        Animal是这个抽象类有一个抽象方法move();

        Bird是子类，继承Animal，非抽象的。
        Bird继承Animal后，会将抽象方法继承过来，但是矛盾了，所以要重写
 */