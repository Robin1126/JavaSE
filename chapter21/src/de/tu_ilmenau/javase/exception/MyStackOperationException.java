package de.tu_ilmenau.javase.exception;
/*
    栈操作异常：自定义异常
 */
public class MyStackOperationException extends Exception {
    public MyStackOperationException() {
    }

    public MyStackOperationException(String message) {
        super(message);
    }
}
