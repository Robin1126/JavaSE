/*
    关于Object类中的equals方法
        1. equals方法的源代码
           public boolean equals(Object obj) {
            return (this == obj);
           }

        2. 该方法的目的，判断两个对象是否相等

        3. 我们需要研究一下Object类给的这个默认的equals方法够不够用！
            IDEA可以自动生成，don't worry~
 */
public class Test02 {
    public static void main(String[] args) {
    //判断变量的值是否相等直接使用双等号就行
        int a = 100;
        int b = 100;
        System.out.println(a == b);
        Mytime t1 = new Mytime(2008,8,8);
        Mytime t2 = new Mytime(2008,8,8);
        Mytime t3 = new Mytime(1992,11,26);
        Mytime t4 = null;//效率低，可以运行

        System.out.println(t1 == t2);//不能用==判断，因为比较的是变量里面的内存地址，显然两个对象的内存地址不一样
        System.out.println(t1.equals(t2));//同样也不可以，因为源代码当中采用的也是==去判断的
        System.out.println(t1.equals(t3));
        System.out.println(t1.equals(t4));
    }
}

