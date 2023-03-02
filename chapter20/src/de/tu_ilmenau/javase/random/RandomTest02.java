package de.tu_ilmenau.javase.random;

import java.util.Random;

/*
    编写程序编写5个不重复的随机数，重复的话重新生成
 */
public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        String arr = "";
        arr += String.valueOf(random.nextInt(5));
        String s1;
        for (int i = 1; i < 5; i++) {
            s1 = String.valueOf(random.nextInt(5));
            while (arr.contains(s1)) {
                s1 = String.valueOf(random.nextInt(5));
            }
            arr += "," + s1;
        }//System.out.println(arr);
        String[] array = arr.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
