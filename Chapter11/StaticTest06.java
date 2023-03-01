/*
	1.使用static关键字可以定义：静态代码块
	
	2.什么是静态代码块？语法是什么？
	static {
		java语句；
		java语句；
	}
	
	3.静态代码块的特点
		在类加载时执行，并且只执行一次，静态代码块有这样的特征/特点

	4.注意：静态代码块在类加载时执行，并且在main方法执行之前执行，并且按照自上而下的顺序执行，如下面的ABC
		A
		B
		C
		Hello World!

	5. 静态代码块一般是从上到下执行

	6. 静态代码块有啥用？
		第一：并不那么常用，不是每一个类都要写的
		第二：静态代码块实际上是SUN公司给程序员的一个特殊的时机
		这个时机叫做：类加载时机

		具体的业务：
		PM说了，只要是类加载了，请记录一下类加载的日志信息，在什么时候，哪个类加载到JVM当中了
		一般一个类只会写一个不会写多个
*/

public class StaticTest06 {

	//静态代码块
	static {
		System.out.println("A");
	}

	//一个类当中可以编写多个静态代码块
	static {
		System.out.println("B");
	}

	public static void main(String[] args) {
		System.out.println("Hello World!"); //程序的入口
	}

	static {
		System.out.println("C");
	}
}