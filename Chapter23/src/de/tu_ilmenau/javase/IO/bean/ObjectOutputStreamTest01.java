package de.tu_ilmenau.javase.IO.bean;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
    例子：ObjectOutputStream的编写方式
    1. NotSerializableException 对象不支持序列化！
    2. 参与序列化的对象必须实现Serializable接口
    3， Serializable接口是一个标志性接口，里面并没有任何代码
        那么它的作用就是一个标识的作用，用于JVM辨别，给JVM参考的
        JVM看到这个标识以后，会自动给这个类生成一个序列号版本号

    4. 序列号版本号的作用？？？由于实现了serializable
    InvalidClassException无效的类异常
    stream classdesc serialVersionUID = 5934338788061719528, 十年后，改动以后的
    local class serialVersionUID = 7938678367838753692 十年前改动之前的原始

    java语言中采用什么机制区分？
        1. 采用类名比对，如果不是一个类名，肯定不是一个类
        2. 如果类名相同，采用序列化版本号进行区分
    比如两个人写了一个名字的类，但是这两个类确实不是同一个类，但由于这两个类都实现了serializable，但是由于序列化版本号不一致，JVM还是能区分出来的

    请思考：
        自动生成的序列号有什么缺陷？
        缺陷就是，如果你这个类是同一个类，但是是后来修改过的，现在就不能进行反序列化了！并不是不同人写的同一个名字的类
        一旦代码确定之后，不能进行后续的修改，因为修改后重新编译会生成一个全新的版本号，jvm认为是一个全新的类
        所以不建议自动生成序列化版本号

    最终建议：凡是一个类实现了serializable接口，建议给这个类给一个固定的序列化版本好，方便如果后面修改类的代码的时候，之前序列化的对象反序列化的时候不会出错
    private static final long serialVersionUID = 1L; 只有类名相同的时候才需要这样
    只要有序列化版本号就行，就能够反序列化回来，即使属性改动了，也没关系

 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        Student s1 = new Student(54684,"lbb");
        Student s2 = new Student(98693,"zky");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));
        //NotSerializableException 不支持序列化
        oos.writeObject(s1);
        oos.writeObject(s2);
        //对应的类必须写上implements Serializable

        oos.flush();
        oos.close();
    }
}
