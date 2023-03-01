/*
	方法的类名什么时候可以在调用的时候省略？
		在同一个类的时候可以省略，跨类不可以省略
*/

public class MethodTest04 {
	
	//程序的入口
	public static void main(String[] args) {
		//调用print方法
		MethodTest04.print1();
		print2();
		Myclass.print3();
	}

	public static void print1() {
		System.out.println("Hello world1!");
	}

	public static void print2() {
		System.out.println("Hello world2!");
	}
}

//类2 第一次跨类调用，之前的都是在一个类里面
class Myclass
{
	public static void print3() {
		System.out.println("Hello world3!");
	}
}