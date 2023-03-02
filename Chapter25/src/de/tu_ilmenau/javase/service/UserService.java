package de.tu_ilmenau.javase.service;

/**
 * 用户业务类
 */
public class UserService {
    /**
     * 检测用户是否成功登录
      * @param name 用户名
     * @param password 密码
     * @return ture表示登录成功，false表示登录失败
     */
    public boolean login(String name, String password) {
        if ("admin".equals(name) && "123".equals(password)) {
            return true;
        }else return false;
    }

    public void logout() {
        /*
            用户退出系统的方法
         */
        System.out.println("System has successfully exit!");
    }
}
