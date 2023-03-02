package de.tu_ilmenau.javase.annotation3;
/*
    如果注解的属性名是value，那么括号里可以省略属性名
    如果不止一个属性，那么value也是不能省略的
 */
public class MyAnnotationTest {
    @MyAnnotation(value = "lbb", email = "oh")
    public static void main(String[] args) {

    }
    @MyAnnotation(value = "haha",email = "go") //属性名是value的时候，这里可以省略value =
    public void doSome() {

    }

    public void doOther() {

    }
}
