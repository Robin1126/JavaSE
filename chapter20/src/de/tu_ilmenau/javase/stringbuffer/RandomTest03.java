package de.tu_ilmenau.javase.stringbuffer;

import java.util.Arrays;
import java.util.Random;

/*
    先写伪代码，再改成正式代码
 */
public class RandomTest03 {
    public static void main(String[] args) {
        //new random object
        Random random = new Random();
        //default int array
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
           array[i] = -1;
        }
        int index = array.length - 1;
        while(index > -1 ){
            int num = random.nextInt(5);
            if (!contains(array, num)){
                array[index--] = num;
            }
        }

        System.out.print("result = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
    //重点在于提取方法的习惯！！！
    public static boolean contains(int[] arr, int key){
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, key) >= 0; //倒序就可以了，正序会因为排序的原因导致index错过
    }
}
