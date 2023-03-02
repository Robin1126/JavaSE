package 访问权限3; //包变化了

import 访问控制权限.User;
//User和VIP不在同一个包下，但是User是VIP的子类
public class VIP extends User {
    public void shopping(){
       // System.out.println(this.name);//默认的
        System.out.println(this.age);//protected
    }
}
