package de.tu_ilmenau.javase.service;

public class VIP {
    private String name;
    private int no;
    private String address;
    private int age;

    public VIP() {
    }

    public VIP(String name) {
        this.name = name;
    }

    public VIP(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public VIP(String name, int no, String address) {
        this.name = name;
        this.no = no;
        this.address = address;
    }

    public VIP(String name, int no, String address, int age) {
        this.name = name;
        this.no = no;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "VIP{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
