package de.tu_ilmenau.javase.integer;

public class MyInt {
    int value;

    public MyInt() {
    }
    public MyInt(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value); //转换成字符串的常用方法
    }
}

