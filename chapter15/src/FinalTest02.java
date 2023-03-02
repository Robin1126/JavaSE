/*
    final修饰的变量如果是一个引用会怎么样？
    其中引用也是一个变量，那就是保存的地址不允许改变
    final修饰的引用只能永远指向该对象，无法再指向其它对象
    虽然final的引用指向A后不能再指向别的对象，但是所指向的对象的属性是可以改变的
 */

public class FinalTest02 {
    public static void main(String[] args) {
        Person p = new Person(15);
        System.out.println(p.age);


        //---------------------------
        //代码不管怎么变，p1也是一个变量，只不过它存的是一个地址，是一个引用
        final Person p1 = new Person(30);
        //p1是局域变量，因为在方法当中
        //p1 = new Person(); 新的内存地址已经不能赋值给p1了
        //p1 = null; 同样它也不能变为null
        //这个对象只有在这个方法执行完毕之后才能回收
        p1.age = 25;
    }
}

class Person {
    int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }
}