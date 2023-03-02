package de.tu_ilmenau.javase.reflect;

import de.tu_ilmenau.javase.bean.User;
/*
    通过class.newInstance()调用无参数构造方法实例化对象
    这种方式更加灵活
 */
public class ReflectTest02 {
    public static void main(String[] args) {
       // 不使用反射机制
        User user = new User();
        System.out.println(user);



        // 通过反射机制获取Class，然后通过Class实例化对象
        try {
            Class c = Class.forName("de.tu_ilmenau.javase.bean.User");
            Object obj = c.newInstance();//调用类的无参数构造方法完成构造对象，但是如果原来的类当中没有无参数构造方法，就会出现异常
            //InstantiationException 实例化异常，因此必须保证无参构造的存在
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

