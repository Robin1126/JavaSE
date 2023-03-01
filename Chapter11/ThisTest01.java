/*
	this:
		1. this是一个关键字，全部小写
		2. this是什么，内存方面是怎样的？
			this是在堆内存的对象内部，也就是说先要创建对象出来才行
			this保存了这个内存对象自身的内存地址
			一个对象一个this，this是一个变量，是一个引用=存储地址的变量就叫做引用
			所以严格上来说，this就是这个对象本身，this指向了自己，所以和c1是一样的
		3. this只能使用在实例方法中。
			谁调用这个实例方法，this就代表谁，所以this代表的是当前对象

		4. this大部分情况下是可以省略的
*/

public class ThisTest01 {
	public static void main(String[] args) {
		Customer c1 = new Customer("LBB");
		c1.shop();
		
		Customer c2 = new Customer("ZKY");
		c2.shop();

		Customer.doSome();
		Student s = new Student();
		s.m1();
	}
}

class Customer {
	// 属性
	String name;

	// 构造方法
	public Customer() {
		
	}

	public Customer(String s) {
		name = s;
	}

	//顾客购物的方法

	//一个实例方法
	public void shop() {
		//这里的this是当前对象
		//c1调用shop(),this代表c1
		System.out.println(this.name + "正在购物！"); //指向当前的调用方法的对象，可以省略
	}

	public static void doSome() {
		System.out.println("do some");//不能写成System.out.println(this);静态是没有对象的
	}
}

class Student {
	String name = "猪宝宝"; //先new对象，通过引用.访问

	public void m1() {
		System.out.println(name); //能不能访问这个name？不可以，因为这是一个静态的方法，是通过类来调用的
		//而name是实例变量，需要先创建对象才能访问
		//总而言之就是this不能跟static共存
	}
}