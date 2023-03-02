package de.tu_ilmenau.javase.reflect;
/*
    可变长度参数
    int... args这就是可变长度参数
    语法是类型...三个点

    1. 可变长度参数要求的参数个数是0...n个
    2. 可变长度参数在参数列表里面必须是最后一个，而且最多只能有一个
    3. 可变长度参数可以当作一个数组来看待
 */
public class ArgsTest {
    public static void main(String[] args) {
        //int类型随便传
        m();
        m(10);
        m(10,20);
        //m2方法
        m2("lbb",123);
        m2("lbb");
        m2("zky",20,30,5060);
        //m3方法
        m3("lbb","zky","bubu","yier");

        //也可以直接传一个数组进去
        String[] strs = {"bb","zbb","yier"};
        m3(strs);
        m3(new String[]{"我","爱","开","元","0522"});
    }

    public static void m(int... args) {
        System.out.println("m方法执行了！");
    }

    public static void m2(String s, int... args1) {
        System.out.println("m2方法执行了！");
    }

    public static void m3(String... args) { //args有length属性，说明有数组属性
        //args有length属性
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}


