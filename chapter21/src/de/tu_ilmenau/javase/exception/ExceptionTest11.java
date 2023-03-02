package de.tu_ilmenau.javase.exception;
/*
    try不能单独使用，try和finally可以联合使用
 */
public class ExceptionTest11 {
    public static void main(String[] args) {
        //执行第一个sout之后检测到retrun，然后执行finally语句块，最后再return
        try {
            System.out.println("try...");
            return; //保证finally的语句块执行完以后再执行这个结束方法
        } finally {
            System.out.println("finally...");
        }
    }
}
