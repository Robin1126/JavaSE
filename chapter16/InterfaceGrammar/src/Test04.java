/*
    继承和实现都存在的话，代码应该怎么写
    extends关键字在前，implement关键字在后
    就算没写extends也是默认extends Object这个老祖宗的
 */
public class Test04 {
    public static void main(String[] args) {
        Flyable f = new Cat();//现在看Animal类还没有用
        f.fly();

        Flyable p = new Pig();
        p.fly();
    }
}
//动物类
class Animal {

}
//可飞翔的接口（翅膀）
//接口一般提取行为动作
interface Flyable {
    void fly();
}
//Flyable是一个接口，通过接口x到猫身上让猫可以飞起来
class Cat extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("枕巾正在飞翔");
    }
}
//蛇类，如果不想让它飞，就不让它去实现flyable这个接口
//想飞就x翅膀，这样就可以不在Animal class当中定义fly这个功能了！！！完成了分割！！
class Snake extends Animal {

}
class Pig extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("猪飞起来了！");
    }
}
class Fish implements Flyable {
    @Override
    public void fly() {
        System.out.println("六眼飞鱼！");
    }
}