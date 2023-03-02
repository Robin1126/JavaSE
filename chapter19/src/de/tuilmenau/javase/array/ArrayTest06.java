package de.tuilmenau.javase.array;
/*
模拟一个系统，假设这个系统要使用，必须输入用户名和密码
 */
public class ArrayTest06 {
    //用户名和密码输入到String[] args当中
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("输入程序参数，包含用户名和密码信息，例如：张三 123");
            return;
        }
        //程序进行到此处，用户应该输入了用户名和密码
        String username = args[0];
        String password = args[1];

        System.out.println(("admin".equals(username) && //变量放在后面，不会出现空指针异常
                            "123".equals(password) ?
                            "登录成功,欢迎[" + username + "]回来\n" +
                                    "您可以继续使用系统" :
                            "用户名或密码输入错误"));
    }
}
