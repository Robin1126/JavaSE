package de.tuilmenau.javase.array;
import java.util.Arrays;
/*
    使用sun公司提供的数组工具类：java.util.Arrays, sun直接给你写好了直接使用就可以了
 */
public class ArraysTest01 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 4, 5, 6, 9, 1};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
