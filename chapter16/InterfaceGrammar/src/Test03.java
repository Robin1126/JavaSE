/*
    接口和接口之间支持多继承，那么一个类可以实现多个接口嘛？
        对于计算机来说，他有很多接口，分别接鼠标，显示器等等

    重点！！！！ 一个类可以同时实现多个接口
    多实现其实就类似多继承，因为现实世界中是存在多继承的。

    没有继承关系，不能向下转型这句话对接口行不通，但是运行还是可能会出错
    因为转型后的可能没有实现关系

    调用其他接口的方法需要接口转型
    或者可以直接向下转型也可以

 */
public class Test03 {
    public static void main(String[] args) {
        M m = new E();
        //经过测试，接口和接口之间进行强制转换虽然没有继承关系也可以
        //但是一定要注意，运行时可能会出现ClassCastException
        //K k = (K)m; //接口转换？？？运行会出现问题，因为E对象跟k没关系
        if (m instanceof K) {
            K k = (K)m;
        }
    }
}
interface M { void m1(); }
interface K { void k1(); }
class E implements M {
    @Override
    public void m1() {
        return;
    }
}
//--------------------------
interface X {

}
interface Y {

}
interface Z extends X,Y {

}

interface A {
    void m1();
}
interface B {
    void m2();
}
interface C {
    void m3();
}
class D implements A,B,C {
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}