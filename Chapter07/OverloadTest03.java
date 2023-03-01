/*
	方法重载 overload
	什么时候需要考虑方法重载？
		在同一个类当中，如果功能1和功能2它们的功能是相似的，
		可以考虑将它们的方法名一致，这样代码既美观，又方便记忆。

	注意！如果两个方法的功能不相干，overload则会导致代码更加麻烦。无法进行方法功能的区分

	什么时候代码会发生方法重载?
		条件1：在同一个类当中
		条件2：方法名相同
		条件3：参数列表不同
	当同时满足上面3个条件的时候，那么我们可以认为发生了重载机制

	什么叫参数列表不同？
		参数的个数不同，参数的类型不同，参数的顺序不同 这3个都算参数列表不同
*/

public class OverloadTest03 {
	public static void main(String[] args) {
		m1();
		m1(100);

		m2(10, 3.14);
		m2(3.14, 10);

		m3(10);
		m3(10.0);
	}

	public static void m1(){
		System.out.println("m1无参数的执行！");

	}

	public static void m1(int a) {
		System.out.println("m1有一个int参数执行！");
	}
	//以上为参数的个数不同

	public static void m2(int a, double b) {
		System.out.println("m2(int a, double b)");
	}

	public static void m2(double a, int b) {
		System.out.println("m2(double a, int b)");
		
	}
	//以上为参数的顺序不同，也算不同


	public static void m3(int x) {
		System.out.println("int x");
	}

	public static void m3(double y) {
		System.out.println("double y");
	}

	//以上为参数的类型不同

	public static void m4(int a, int b) {
		
	}

	//这个跟上面的那个是一样的 public static void m4(int x, int y) 这是方法重复！

	public static int m5() {return 1;}

	//public static double m5() {return 1.0};这个也是一样的，因为可以不接收值的，所以返回值类型没有关系

	//注意！编译器区分只在意方法名和后面的形参，同样的道理，前面的修饰符public static 也无关0

}

class MyClass {
	public static void m1(int x, int y) {
		
	}
}

