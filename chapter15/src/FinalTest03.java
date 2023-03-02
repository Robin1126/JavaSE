/*
    final修饰实例变量会怎么样？
    实例变量只能赋值一次，sun规定这个实例变量必须在写的时候就要直接手动赋值上去，不能让系统自动赋值

    结论：
    final修饰的成员变量，系统不管默认值，必须程序员手动赋值。
    不背锅！！你自己改变，不怪我的系统。
    实例变量在new对象的时候进行赋值
    final修饰的成员变量可以在构造方法中赋值，也可以在声明的时候赋值2选1 但是不能没有，因为系统不管他的默认值
 */
public class FinalTest03 {
    public static void main(String[] args) {
        User u = new User();
    }
}

class User {
    int i = 0; // 这里也是在构造方法的时候进行赋值的
    // final int age
    //final double height = 1.8;
    //以下代码联合起来weight也是只赋值了一次
    final double weight;
    public User() {
        this.weight = 80; //只要我赶在系统赋默认值之前赋值就行
    }
}
class Admin {
    final int i;

    public Admin() {
        this.i = 13;
    }

    public Admin(int i) {
        this.i = i;
    }
}
