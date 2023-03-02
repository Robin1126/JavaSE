package de.tuilmenau.javase.array;
/*
    关于Java中的二维数组
        1.二维数组是一个特殊的一维数组，特殊在这个一维数组中的每一个元素都是一个一维数组（数组存数组）
        2.三维数组是什么？
            三维数组是特殊的二维数组，特殊在每个元素都是一个一维数组
        3.二维数组静态初始化
            int[][] array = { {1, 2, 3}, {2, 3, 4, 5}, {0}}
        4.
        注意：实际开发过程中，一维数组最常用，二维数组很少用，三维数组基本不用
 */
public class ArrayTest09 {
    public static void main(String[] args) {
        //一维数组
        int[] array = {100, 200, 300};
        //二维数组
        int[][] a = { //里面是4个一维数组，数组和数组之间用逗号分开
                {100, 200, 300},
                {30, 20, 40, 50},
                {0},
                {6, 7, 8, 9}
        };
        System.out.println(a.length);//4 因为有4个一维数组，看的是最外层的大括号里面有几个一维数组
        System.out.println(a[0].length);//3 {100, 200, 300}
        System.out.println(a[1].length);//4 {30, 20, 40, 50}
        System.out.println(a[2].length); //1 {0}

    }
}
