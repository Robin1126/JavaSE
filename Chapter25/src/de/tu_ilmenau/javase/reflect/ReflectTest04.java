package de.tu_ilmenau.javase.reflect;
/*
    研究Class.forName()发生了什么
    记住！重点，如果你只是想让一个类的静态代码块执行，那么就可以用Class.forName()静态方法，这样就会加载类进行触发静态代码块

    提示：
        后面JDBC的时候我们还要使用
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            // forName方法会让静态代码块执行，因为他加载了字节码文件进入方法区
            Class.forName("de.tu_ilmenau.javase.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

