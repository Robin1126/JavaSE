package de.tuilmenau.javase.array;
//当一个方法的参数是一个数组的时候，我们还可以采用这种方法传
//使用静态方法测试方便，不用new对象
public class ArrayTest04 {
    public static void main(String[] args) {
        //静态初始化一维数组
        int[] a1 = {1, 2, 3};
        printArray(a1);
        //动态初始化
        System.out.println();
        int[] a2 = new int[4];
        printArray(a2);

        System.out.println();
        printArray(new int[2]);

        //直接传递一个静态数组，语法这样写
        System.out.println();
        printArray(new int[]{1, 2, 3, 4});
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
