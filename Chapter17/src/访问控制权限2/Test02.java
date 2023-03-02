package 访问控制权限2;//包变化了

import 访问控制权限.User;

public class Test02 {
    public static void main(String[] args) {
        User user = new User();
        //System.out.println(user.id);
        //System.out.println(user.age); //protected
        //System.out.println(user.name); //默认
        System.out.println(user.weight); //public 在哪都行
    }
}
