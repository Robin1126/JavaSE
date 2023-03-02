package de.tu_ilmenau.javase.exception;
/*
    finally面试题
    分析：java语法规则
    方法体中的代码必须依照自上而下的顺序依次逐行执行
    return语法一旦执行，必须结束整个方法
 */
public class ExceptionTest13 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);
    }
    
    public static int m() {
        int i = 100;
        try {
            return i; //这里实际上是 int j = i, 然后返回的是j
        } finally {
            i++;
        }
    }
}
