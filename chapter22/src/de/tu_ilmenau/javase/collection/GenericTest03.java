package de.tu_ilmenau.javase.collection;
/*
    自定义泛型可以吗？
    --可以！
    自定义泛型的时候，<>中的是一个标识符，随便写
    如果定义了不用，那就是默认Object
 */
public class GenericTest03<标识符随便写> {
    public void doSome(标识符随便写 o) { //这里表示的是对象的类型和doSome里面o的类型要一致
        System.out.println(o);
    }

    public static void main(String[] args) {
        //new对象的时候指定了泛型是String
        GenericTest03<String> gt = new GenericTest03<>();
        gt.doSome("123");

        GenericTest03<Double> gt1 = new GenericTest03<>(); //不能用基本数据类型，因为他是一个对象啊！！只能用包装过后的
        gt1.doSome(123.0);

        MyIterator<String> mi = new MyIterator<>();
        String s1 = mi.get();

        MyIterator<Animal> mi1 = new MyIterator<>();
        Animal s2 = mi1.get();

        //不用泛型就是Object
        GenericTest03 gt3 = new GenericTest03();
        gt3.doSome("111");
    }

}
class MyIterator<T> {
    public T get() {
        return null;
    }
}