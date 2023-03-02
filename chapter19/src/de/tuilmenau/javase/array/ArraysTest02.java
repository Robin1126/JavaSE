package de.tuilmenau.javase.array;
import java.util.Arrays;
/*
    sun公司已经为我们程序员开发好了工具
    不要死记硬背
    shift按两次进入查找
    然后在class中查找java.utils.Arrays
    按ctrl+f12查找方法
 */
public class ArraysTest02 {
    public static void main(String[] args) {
        int[] arr = {3,6,5,12,1,32,56,69};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //二分法查找
        int index = Arrays.binarySearch(arr,30);
        System.out.println(index < 0 ? "该元素不存在":"该元素下标是" + index);
    }
}
