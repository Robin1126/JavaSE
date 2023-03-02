package de.tu_ilmenau.javase.exception;
/*
    当时方法覆盖的时候，重写之后的异常不能比重写之前抛出更多的异常
    假设父类抛出异常，子类可以不抛，也可以抛出一样或者是更小的子异常
    子类可以抛出的是运行异常没影响

 */
public class ExceptionTest16 {

}

class Animal {
    public void doSome(){

    }
    public void doOther() throws Exception{

    }
}
class Cat extends Animal {
    public void doSome(){ //'doSome()' in 'de.tu_ilmenau.javase.exception.Cat' clashes with 'doSome()' in 'de.tu_ilmenau.javase.exception.Animal'; overridden method does not

    }
    public void doOther()  {

    }
}
