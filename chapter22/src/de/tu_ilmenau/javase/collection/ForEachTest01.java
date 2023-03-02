package de.tu_ilmenau.javase.collection;
/*
    JDK5.0以后推出的一个新特性：叫做增强for循环，或者叫做foreach
 */
public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr = {432, 4, 65, 46, 54, 76, 54};
        //普通for循环
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //增强for循环 foreach
        /*
            语法
            for(元素类型 变量名 ： 数组或集合) {
                System.out.println(变量名)
            }
         */
        System.out.println("++++++++++++++++++++");
        //缺点就是没有下标，在需要使用下标的循环中不建议使用增强for
        for (int data : arr // data就是数组中的元素
             ) {
            System.out.print(data + " "); //直接遍历了arr中的所有元素
        }
    }
}
