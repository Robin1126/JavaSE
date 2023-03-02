package de.tu_ilmenau.javase.random;

import java.util.Random;

/*
    随机数
 */
public class RandomTest01 {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt();//在int范围中随机选一个数
        System.out.println(num1);

        int num2 = random.nextInt(101);//从0-100，不包括101
        System.out.println(num2);

    }
}
