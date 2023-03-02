package de.tu_ilmenau.javase.exception;
/*
    自定义异常在实际开发中的应用！！！
    以后有异常的情况，都是先自定义异常种类，然后自己写异常信息，手动抛出异常，然后进行处理
    养成这种编码的风格！！！
 */
public class ExceptionTest15 {
    public static void main(String[] args) {
        MyClassException e = new MyClassException("用户名不能为空");

        e.printStackTrace();

        String s = e.getMessage();
        System.out.println(s);
    }
}
