package de.tu_ilmenau.javase.annotation4;

public class OtherAnnotationTest {
    public static void main(String[] args) {

    }
    @OtherAnnotation( age = 30,email = {"123","456"}, seasonArray = {Season.SUMMER,Season.WINTER}) //属性是数组的形式，跟数组是一样的，大括号括起来，如果数组中只有一个元素，大括号可以省略
    public static void doSome() {

    }
}
