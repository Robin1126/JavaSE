/*
	1. 方法覆盖需要和多态机制联合起来使用才有意义
			如果没有多态，那么就相当于另外写一个方法一样的
			Animal a = new Cat();
			a.move();
			我们需要编译的时候move方法是Animal的
			运行的时候自动调用子类的move方法上

		没有多态的话，方法覆盖可有可无
		没有多态机制，方法覆盖也可以没有，如果父类的方法无法满足子类业务，完全可以在子类定义一个全新的方法

		方法覆盖和多态相关，多态也就和对象相关
	
	2. 静态方法存在方法覆盖嘛？ 
		静态方法不存在方法覆盖，因为它和对象无关，和类有关
*/

public class OverrideTest05 {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.doSome(); //Animal的doSome方法执行！
		//静态方法和对象无关，虽然使用引用.来调用，但实际上看的还是Animal类里面的方法
		Cat.doSome();
	}
}

class Animal {
	public static void doSome() {
		System.out.println("Animal的doSome方法执行！");
	}
}

class Cat extends Animal {
	public static void doSome() {
		System.out.println("Cat的doSome方法执行！");
	}
}