package de.tu_ilmenau.javase.IO.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private int no;
    private String name;

    /*
    很久之后，Student的这个类源代码改变了，加上了age属性
    源代码改动之后，需要重新编译，生成了新的字节码文件
    并且class文件再次与行动时候，java虚拟机生成的序列化版本号也会发生相应的改变
     */
    private int age;
    //来一个序列化版本号手动赋值
    private static final long serialVersionUID = 1L;

    private String email;
    private String address;

    public Student(int no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
