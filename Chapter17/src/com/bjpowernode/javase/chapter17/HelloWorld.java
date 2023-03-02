/*
    关于Java语言当中的package和import机制：
        1. 为什么要使用package
            package是Java中的包机制，包机制的作用是方便程序的管理
            不同功能的类分别存放在不同的包下面（按照功能划分的，不同的软件包有不同的作用功能）

        2. package怎么用
           package是一个关键字，后面加包名
           如 package com.bjpowernode.javase.chapter17;
           注意：package只允许出现在Java源代码的第一行

        3. 包名有没有规范？有！
           一般都采用公司域名倒序的方式，因为公司域名具有全球唯一性
           package命名规范
            公司域名倒序 + 项目名 + 模块名 + 功能名

        4. 对于带有package的Java程序怎么编译和运行？
            采用之前的编译和运行不行了
            类名不再是HelloWorld了
            类名是com.bjpowernode.JavaSE.Chapter17.HelloWorld

            编译:
                javac -d . HelloWorld.java 当前目录下新建一堆文件夹然后把.class文件放到最后的chapter17文件夹中
                javac 编译的命令
                -d    带包编译
                .     生成的东西放到当前目录下
                HelloWorld.java 被编译的java文件名

         5. 关于import的使用
            什么时候用？
            A类和B类不在一个包下,需要用import导入
            java.lang.*;这个包下面的类不需要导入，特殊待遇
            怎么用？
            在package下面，在public class的上面
            import语句可以采用星号的方式
            import java.util.*


 */
package com.bjpowernode.javase.chapter17;
public class HelloWorld { //
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
