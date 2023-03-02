//当一个方法上的参数是一个数组的时候，我们应该怎么传递参数进去
package de.tuilmenau.javase.array;

public class ArrayTest03 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};
        printArray(x);

        String[] s = {"yier", "bubu", "lbb"};
        printArray(s);

        String[] s1 = new String[10];
        printArray(s1); //10个null
        System.out.println("=========");
        printArray(new String[3]);//直接新建也行
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    //方法重载overload
    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("数组上的元素：" + array[i]);

        }
    }
}
