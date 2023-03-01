/*
	构造方法
		1. 什么是构造方法，有什么用？
			构造方法是一个比较特殊的方法
			通过构造方法可以创建对象，并且同时给对象的属性赋值。但他的本质也是一个方法
			（实例变量在没有手动赋值的时候，系统会自动赋值缺省值）
		
		2. ！！！当一个类中没有提供任何方法，那么系统实际上会自动给这个类提供一个无参数的构造方法。系统自己默认的
			而这个构造方法被称为缺省构造器

		3. 构造方法是通过new来调用的，使用new运算符来调用
			[修饰符列表] 构造方法名（形式参数列表）{ 构造方法体}
			构造方法中
			注意： 1. 修饰符现在统一写public
					 2. 构造方法名必须和类名一致
					 3. 构造方法不需要指定返回值类型，写上void就是普通方法了
			通常在构造方法体当中给属性赋值，完成属性的初始化


			普通方法的语法结构:
			[修饰符列表] 返回值类型 方法名 （形式参数列表） { 方法体}
*/


public class ConstructorTest01 {
	public static void main(String[] args) {

		//调用student类的无参数构造方法
		new Student();
		//实际上创造了2个对象，没有引用，这第一个创造完就被当成垃圾丢掉了
		ConstructorTest01.doSome(); //调用一般方法
		doSome();
		
		
		Student s = new Student(5);
		System.out.println(s.no);

		Student s2 = new Student();
		System.out.println(s2.no);
		
		System.out.println(s);//输出引用，不是null就代表创建成功了
		//Student@2f92e0f4

		
	}

	public static void doSome() {
		System.out.println("do something!");
	}
}