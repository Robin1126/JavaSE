package de.tu_ilmenau.javase.exception;
/*
    1. 异常的老祖宗是throwable，我们可以用UML来描述
    2. 什么是UML？有什么用？
        UML是一种统一建模语言。
        一种图标式语言，画图用的
        UML不是只有java中使用。只要是面向对象的编程语言，都有UML
        一般UML都是软件架构师或者是系统分析师，这些级别的人使用的

        在UML图中可以描述类和类之间的关系，程序执行的流程，对象的状态等等。

        盖大楼和软件开发一样，一个道理，都要有蓝图，蓝图上面的语言都是规范化的

     3. throwable的异常分两种，一种是Exception，一种是Error
        Error一旦发生，程序就会中止
        Exception一旦发生，会报错，但是程序员可以处理

        编译时异常和运行时异常，都是发生在运行阶段。编译阶段异常时不会发生的。
        编译时异常必须在编译阶段预先处理，如果不处理，编译器报错。

     4. 编译时异常和运行时异常的区别
        编译时异常一般发生的概率比较高。
            例子：看到外面下雨，出门之前如果不打伞会生病，而且这个异常发生的概率很高。出门前拿一把伞就是对异常发生之前的一种方式
            这就是运行之前的预处理~

        运行时异常一般发生的概率比较低。
            例子：小明走在大街上可能会被天上的飞机轮子砸到，砸到也是一种异常，但是概率较低。在程序运行之前没必要对这种概率较低的异常进行处理。
            如果处理这种异常，会活得很累。

        假设如果没有异常的分类，虽然程序运行很安全，但是程序员要处理很多异常，编写程序太累。

        它们还有其他名字
        编译时异常 = 受控异常，受检异常
        运行时异常 = 未受控异常，未受检异常

        强调！！所有异常都是发生在运行阶段

        5. 怎么处理异常？
            第一种方式：在方法声明的位置上，使用throws关键字，抛给上一级，告诉上一级，谁调用抛给谁。
                上一级同样也是这两种方式处理，迭代，直到最上层如果不能处理，最后JVM就中止了。
            第二种方式：使用try...catch来进行捕捉，自己掏腰包搞定

 */
public class ExceptionTest03 {
    public static void main(String[] args) {
        NumberFormatException nfe = new NumberFormatException();
        /*
            程序发生了ArithmeticException异常，底层new了一个异常对象，然后抛出了，由于main方法调用了100/0，所以这个异常抛给了main，
            但是由于main方法没有处理，最后JVM中止了程序
            这个异常属于运行时异常，不需要在编写时预先处理
         */
        System.out.println(100 / 0);
        System.out.println("Hello World!");
    }
}