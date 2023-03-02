/*
    equals重写要彻底
 */

import java.util.Objects;

public class Test05 {
    public static void main(String[] args) {

        People u1 = new People("lbb",new Address("Ilmenau","Bergrat",98693));
        People u2 = new People("lbb",new Address("Ilmenau","Bergrat",98693));
        System.out.println(u1.equals(u2)); //equals里面的是object 自动类型转换
        System.out.println(u1);
        System.out.println(u2.address);
    }
}
class People{
    String name;
    Address address;

    public People() {
    }

    public People(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    //这个equals判断的是People之间
    public boolean equals(Object obj) { //如果this为空是可能空指针异常的
        if (obj == null || !(obj instanceof People)) return false;
        if (this == obj) return true;
       
        People u = (People) obj;
        if (u.name.equals(this.name) && u.address.equals(this.address))
        {
            return true;
        }
        return false;
    }

    public String toString() {
        return  "People{" +
                "name='" + this.name + '\'' +
                ",city='" + this.address.city + '\'' +
                ",street='" + this.address.street + '\'' +
                ",zipcode=" + this.address.zipcode;
    }
}
class Address{
    String city;
    String street;
    int zipcode;

    public Address() {
    }

    public Address(String city, String street, int zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
    //重写toString
    public String toString() {
        return "Address{" +
                "city='" + this.city + '\'' +
                ",street='" + this.street + '\'' +
                ",zipcode=" + this.zipcode +
                "}";
    }
    //重写euquals方法

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(zipcode, address.zipcode);
    }

}
