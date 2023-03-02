package de.tuilmenau.javase.array;
/*
    一维数组的深入，数组中存储的是引用类型
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Cat c3 = new Cat();
        Animal a4 = new Animal();
        Animal[] animals = {a1, a2, c3, a4};
        //Animal数组中只能存放Animal类型，不能放别的，但是可以放继承的子类对象
        //因为这是它的孩子

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        Animal[] ans = {new Cat(), new Bird()};
        for (int i = 0; i < ans.length; i++) {
            //取出来的可能是cat，可能是bird
            //如果调用的方法是父类的方法，不需要向下转型，直接调用即可
            if(ans[i] instanceof Cat) {
                ((Cat) ans[i]).catchMouse();
            }else if(ans[i] instanceof Bird){
                ((Bird) ans[i]).sing();
            }
        }
    }
}

class Animal{
    public void move(){
        System.out.println("Animal move...");
    }
}
class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("Cat move...");
    }
    public void catchMouse(){
        System.out.println("Cat catches mouse...");
    }
}
class Bird extends Animal{
    public void move() {
        System.out.println("Bird flys...");
    }
    public void sing() {
        System.out.println("Bird sings song...");
    }
}
