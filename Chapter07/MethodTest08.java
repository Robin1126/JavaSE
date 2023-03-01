//方法结束以后，局部变量的内存就释放了
//JVM中主要有三块内存，栈内存，堆内存，方法区内存
//方法调用的时候，在栈中分配空间
//方法不调用，是不会在栈中分配空间的
//调用时候就是push进栈，然后调用完成就pop出栈

//栈中存储什么？方法运行过程中需要的内存，以及栈中会存储方法的局部变量
//本质上 方法调用就是一个栈的使用，总是处理在栈顶的方法
public class MethodTest08 {
	public static void main(String[] args) {
		System.out.println("main begin");
		int x = 100;
		m1(x); //传给方法m1，复制一份100传进去，原来的x不动
		System.out.println("main over");
	}

	public static void m1(int i) {
		System.out.println("m1 begin");
		m2(i);
		System.out.println("m1 over");
	}

	public static void m2(int i) {
		System.out.println("m2 begin");
		m3(i);
		System.out.println("m2 over");
	}

	public static void m3(int i) {
		System.out.println("m3 begin");
		System.out.println(i);
		System.out.println("m3 over");
		
	}

	//虽然每个i的值都是100，但是所占的内存都是不一样的
}

/*
	总结：
	1. 内存图能帮助更深层次理解运行原理
	2. 方法区存的是代码
	3. 栈内存存的是方法执行时候的内存空间和局部变量
	4. 方法调用时叫push分配空间，结束是pop释放空间
	5. 栈的特点是first in last out
*/