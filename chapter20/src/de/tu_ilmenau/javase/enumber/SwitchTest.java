package de.tu_ilmenau.javase.enumber;
/*
    switch支持枚举，int，String
 */
public class SwitchTest {
    public static void main(String[] args) {

        switch (Season.SUMMER) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}
