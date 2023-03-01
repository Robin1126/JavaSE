/*
	什么时候我们会考虑使用方法的覆盖呢？
	当子类继承父类之后，当继承过来的方法无法满足当前子类的业务需求时，子类有权利对这个方法进行重新编写，有必要进行方法的覆盖

	方法覆盖又叫做方法重写：override，overwrite都可以 //成员变量member variable，局域变量 local variable，静态变量 static variable，实例变量 Instance variable
	一般写作Override

	回顾一下方法重载？
		在一个类当中，当方法的功能相似时候，建议将方法名改成一样，通过参数列表的不同实现方法重载overload

		什么条件满足后可以实现方法重载？
			条件1：在同一个类当中
			条件2：方法名相同
			条件3：参数不同（个数，顺序，类型）
		
	在代码编写的时候，怎么样构成代码覆盖
		条件1：两个类必须有继承关系
		条件2：重写之后的方法和之前的方法具有
					相同的返回值类型
					相同的方法名
					相同的形式参数列表
				 三者缺一不可
		条件3：访问权限不能更低，可以更高（这个先记住）public权限目前是最高的
				如protected比public访问权限低，如果原来父类是public，子类就不能是protected
				如果原来父类是protected，那么子类调成public就可以没问题
		条件4：重写之后的方法不能比之前的方法抛出更多的异常，可以更少。（这个先记住）
				如父类可以throws Exception 但是子类没有throws Exception

		注意事项：（学习了多态语法之后自然就明白了）
			1. 方法覆盖只是针对方法，和属性无关。
			2. 私有方法无法覆盖
			3. 构造方法无法被继承，也就无法被覆盖
			4. 方法覆盖只是针对实例方法，“静态方法覆盖”没有意义。
*/

public class OverrideTest02 {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.move();
		b.sing();
		b.sing(100);

		Cat c = new Cat();
		c.move();

	}
}

class Animal {
	public void move() {
		System.out.println("动物在移动！");
	}

	public void sing(int i) {
		System.out.println("Animal sing......");
	}
}

class Bird extends Animal {
	//对move方法进行方法override
	//最好将父类的方法复制过来
	//相当覆盖了继承过来的move方法，原来的move方法就没了
	public void move() {
		System.out.println("鸟儿在飞翔！");
	}
	public void sing() {
		System.out.println("bird sing......");
	} //这里就没有方法覆盖,因为参数列表不一样，这里是方法的重载overload

}

class Cat extends Animal {
	public void move() {
		System.out.println("猫在走猫步！");
	}
}