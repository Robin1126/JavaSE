package de.tu_ilmenau.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        User u1 = new User("jack");
        User u2 = new User("jack");
        c.add(u1);
        System.out.println(c.contains(u2));

    }
}

class User{ //因为没有重写equals方法，所有contains的时候比较的是内存地址
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean equals(Object o) {
        if (null == o || !(o instanceof User)) return false;
        if (o == this) return true;
        User u = (User) o;
        return u.getName().equals(this.name); //这里用的是String的equals方法
    }
}
