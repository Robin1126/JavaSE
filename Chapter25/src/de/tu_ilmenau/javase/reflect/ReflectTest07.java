package de.tu_ilmenau.javase.reflect;

import de.tu_ilmenau.javase.bean.Student;

import java.lang.reflect.Field;

/*
    必须掌握：
        怎么通过反射机制访问一个java对象的属性？
            给属性赋值set
            获取属性的值get
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception {
        //不使用反射机制怎么访问属性的值呢？
        Student s = new Student();
        s.no = 1111;
        System.out.println(s.no);
        //使用反射机制
        Class studentClass = Class.forName("de.tu_ilmenau.javase.bean.Student");
        Object obj = studentClass.newInstance();

        //根据属性的名称获取Field
        Field noField = studentClass.getDeclaredField("no");

        // 给obj对象的no属性赋值
        noField.set(obj, 2222); //给obj对象的no属性赋值2222，同样也是在Field上面操作的，对象变成了参数
        // 要素1：对象s 要素2：no属性 要素三：2222值 三要素缺一不可
        // 反射机制灵活性更强，上面的参数都可以放到配置文件里面的

        System.out.println(noField.get(obj)); //两个要素， 要素1：对象obj 要素2：属性名no

        // 可以访问到私有的属性吗？
        Field nameField = studentClass.getDeclaredField("name");
        //要想访问，可以打破封装
        nameField.setAccessible(true);
        //这也是封装的缺点，反射机制的缺点，打破封装可能会给不法分子留下机会
        nameField.set(obj,"lbb");
        System.out.println(nameField.get(obj)); //IllegalAccessException 运行时错误，因为编译器不知道这个是不是private的

    }
}
