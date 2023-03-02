/*
    抽象类是类和类之间有共同特征，将这些具有共同特征的类再进一步抽象形成抽象类，抽象类无法创建对象。
    抽象类和抽象类可以更进一步再往上抽象，如果抽象类之间还有共同特征
    抽象类？
        1. 什么是抽象类?
            类和类之间具有共同特征，将这些共同特征提取出来就是抽象类
            类到对象是实例化，对象到类就是抽象。抽象类是类再往上一层
            类本身是无法实例化的，所以抽象类无法实例化。

        2. 抽象类属于什么类型？
            抽象类是引用数据类型

        3. 抽象类怎么定义？
            语法：
            { 修饰符列表 } abstract class 类名 {
                类体；
            }

        4. 抽象类是无法实例化，无法创建对象，所以抽象类是专门用来被继承的

        5. final和abstract不能同时使用，他们是对立的

        6. 抽象类的子类也可以是抽象类，回忆一下老师的图就知道了

        7. 抽象类里面有构造方法，虽然无法实例化，这个构造方法是提供给子类使用的,它自己不创建对象

        8. 抽象类关联到一个概念，抽象方法？那么什么是抽象方法？
            抽象方法没有实现的方法，没有方法体
            public abstract void doSome(); 没用具体的实现过程
            特点1：没有大括号里的方法体，以分号结尾
            特点2：前面修饰符列表中有abstract关键字

        9. 抽象类当中不一定有抽象方法,但是抽象方法必须出现在抽象类当中。

        写代码能用多态就用多态，慢慢就理解了，目前只是学习了抽象类的基础语法，一个类到底声明为抽象类还是非抽象类

 */
public class AbstractTest01 {
    public static void main(String[] args) {
        //Account是抽象的无法实例化 Account a = new Account();
    }
}

//银行账户类
abstract class Account { //final不能和abstract同时出现，因为没有意义了
    public Account() {
    }
    public Account(String s) {
    }
    //非抽象方法
    public void doOther() { }
    //抽象方法
    public abstract void doSome();


}
//继承抽象类Account
class CreditAccount extends Account {
    public CreditAccount() {
    }
    public CreditAccount(String s) {
        super(s);
    }
    //要想不报错就必须重写称为非抽象方法，因为抽象方法必须在抽象类当中定义
    @Override
    public void doSome() {

    }
}