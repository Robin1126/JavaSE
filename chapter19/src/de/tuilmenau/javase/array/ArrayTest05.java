package de.tuilmenau.javase.array;
/*
1. main方法中的String[] args有什么用？
    分析一下：
    JVM调用main方法的时候，会自动传一个String数组过来
 */
public class ArrayTest05 {
    //JVM调用的时候一定会传一个String[]数组过来
    //通过测试得出，args不是null，就是说这个数组里面没东西
    //就是有一个数组，但是数组里面啥也没有
    //但是数组对象是有的
    public static void main(String[] args) {
        //System.out.println("JVM给穿过来的String数组参数，它的长度是多少？" + args.length); //长度是0？new String[0]
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        ArrayTest05.printLength(args);
    }

    public static void printLength(String[] args){
        System.out.println(args.length);
    }

    //这个数组什么时候会有值呢？ 其实这个数组是留给用户的，用户可以在控制台上输入参数，会被自动转换成为String[] args
    //例如java ArrayTest05 abc def xyz
    //JVM会根据空格将abc def xyz进行分离，分离完成后，填入String[] args数组当中
    //所以main方法中的String[] args数组主要是接收用户的输入参数
    //如上面的例子{"abc", "def", "xyz"}
}
