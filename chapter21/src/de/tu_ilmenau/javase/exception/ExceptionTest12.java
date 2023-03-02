package de.tu_ilmenau.javase.exception;
/*
    System.exit(0); 是退出JVM语句，finally会被这条语句直接抹杀
 */
public class ExceptionTest12 {
    public static void main(String[] args) {
        try {
            System.out.println("try...");
            //return; //保证finally的语句块执行完以后再执行这个结束方法
            System.exit(0);
        } finally {
            System.out.println("finally...");
        }
    }
}
