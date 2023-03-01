/*
	父类中有的方法，子类也有，其实方法重写并没有覆盖掉父类的方法，父类的方法现在只能通过super.来调用，本质上还是在子类上调用
	但一般默认使用的是子类新的方法，就近原则。

	super.属性名	访问父类属性
	super.方法名	访问父类方法
	super()			调用父类的构造方法
*/

public class SuperTest07 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.yiDong();
	}


}

class Animal {
	public void move() {
		System.out.println("Animal move");
	}
}

class Cat extends Animal {
	public void move() {
		System.out.println("Cat move");
	}

	public void yiDong() {
		this.move();
		move();
		super.move();
	}
}

