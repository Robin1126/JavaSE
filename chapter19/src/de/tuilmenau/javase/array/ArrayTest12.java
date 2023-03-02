package de.tuilmenau.javase.array;
/*
    动态初始化二维数组
 */
public class ArrayTest12 {
    public static void main(String[] args) {
        int[][] array = new int[4][5];
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        printArray(a);
        printArray(new int[][]{{1, 2, 3},{4, 5, 6}, {7, 8, 9}, {10, 11, 12}}); //一行的写法，省掉一个a
        System.out.println("=============");
        printArray(new int[]{1, 2, 3, 4});
    }

    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
