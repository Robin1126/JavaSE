package de.tu_ilmenau.javase.integer;
/*
    java中为8种数据类型又准备了8种包装类型。包装类型又属于引用数据类型，父类是Object
    包装类是为了传进object类
    sun公司已经写好了8种包装类，我们可以直接用
 */
public class IntegerTest01 {
    public static void main(String[] args) {
        MyInt myInt = new MyInt(100);
        //doSome方法虽然不能直接传100，但是可以传一个object进去
        doSome(myInt);
    }

    public static void doSome(Object obj){ //参数的类型是object，无法接收基本数据类型，因此要用包装类，这就可以将基本数据类型传进去
        System.out.println(obj);//toString调用
    }
}
