/*
关于每种数据类型的数据值
            数据类型            默认值
            ------------------------
            byte                0
            short               0
            int                 0
            long                0L
            float               0.0F
            double              0.0
            boolean             false
            char                \u0000
            引用数据类型          null

    什么时候采用静态初始化，什么时候采用动态初始化
        如果一开始知道存储哪些具体的元素，直接静态赋值。如果不知道将来数组存储哪些数据，可以采用动态初始化的方式预先分配空间，后期再存储。
    注意:注意数组的大小，千万不要越界。否则出现下标越界异常 ArrayIndexOutOfBoundsException


 */

package de.tuilmenau.javase.array;

public class ArrayTest02 {
    public static void main(String[] args) {
        //动态创建数组
        int[] a = new int[4]; //长度为4，每个元素默认值赋值为0
        System.out.print("数组a：");
        //遍历数组
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Object[] objs = new Object[3];
        for (int i = 0; i < objs.length ; i++) {
            System.out.print(objs[i] + " ");
        }

        String[] strs = new String[3];
        for (int i = 0; i < strs.length ; i++) {
            System.out.print(strs[i] + " ");
        }
        System.out.println();
        //存储Objects，采用静态初始化呢？
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object[] objs1 = {obj1, obj2, obj3};
        for (int i = 0; i < objs.length ; i++) {
            System.out.println(objs1[i]);
        }

        Object[] objs2 = {new Object(), new Object(), new Object()};
    }

}
