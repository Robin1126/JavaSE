package de.tu_ilmenau.javase.annotation;
/*
    注解：或者叫做注释 Annotation
    注解Annotation是一种引用数据类型，编译后也是生成xxx.class
    怎么自定义注解，格式？
        【修饰符】@interface 注解类型名{ }

    如何使用？
        第一：注解使用时的语法格式是：
            @注解类型名

        第二：注解可以出现在类，属性，方法，变量。。。注解还可以出现在注解类型上，套娃

    JDK自带的哪些注解：
        java.lang包下的注释类型：
        Override 用来提示方法重写，如果没有重写父类的方法，报错
        Deprecated注释程序的元素，不鼓励程序员用这样的元素，通常因为它很危险或者有更好的选择

    当一个注解修饰另外一个注解的话，这个注解叫做元注解

    什么是元注解？
        用来标注“注解类型”的注解，称为元注解

    常见的元注解？
        Target
        Retention

    Target是一个元注解，用来标注别的注解的。被Target标注的注解可以出现在哪里呢？
        @Target(ElementType.METHOD):表示被标注的注解只能出现在方法上

    Retention注解是一个元注解，用来标注注解类型的注解，这个Retention注解用来标注被标注的注解最终保存在哪里
        @Retention(RetentionPolicy.SOURCE)：表示该注解只被保留在java源文件当中
        @Retention(RetentionPolicy.CLASS)：表示该注解只被保留在CLASS文件当中
        @Retention(RetentionPolicy.RUNTIME)：表示该注解只被保留在class文件当中,并且可以在反射机制使用
 */
public class AnnotationTest01 {
    @MyAnnotation
    private int no;
    @MyAnnotation
    public AnnotationTest01() {}

    public static void m1() {
        @MyAnnotation
        int i = 100;
    }
    public void m2() {

    }
}
@MyAnnotation
interface MyInterface {

}

enum Season {
    spring,summer,autumn,winter
}
