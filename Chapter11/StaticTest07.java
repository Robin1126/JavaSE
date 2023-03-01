/*
	栈：方法只要执行，会压栈。存储局部变量
	堆：存储实例变量，GC主要工作的区域
	方法区：存放代码，静态变量

	方法的代码片段放在方法区，但是方法的执行是在栈当中的
	
*/

public class StaticTest07 {
	
	static int i = 100;

	int k = 111; //实例变量，要构造对象的时候才可以访问哦

	static {
		System.out.println("i = " + i);
		//System.out.println("k =" + k); 这里无法访问，无法在静态上下文中引用非静态的变量
		//System.out.println("name = " + name);这就不行了，因为它是自上而下的，因为这个时候没有静态变量name
		//只能靠代码的顺序来决定谁先谁后
	}

	//如果静态变量在静态代码块的下面可以访问吗？？
	static String name = "LBB"; 

	//静态变量在类加载时初始化，存储在方法区
	//静态代码块在类加载时执行
	//代码都是放在方法区的
	//这在静态代码块当中是可以访问的
	
	
	public static void main(String[] args) {
		System.out.println("main方法begin");
		System.out.println("main方法end");
	}

	public static void x() {  }
	public static void y() {  }
	//方法放在前面还是后面是没有关系的
}

/*
	总结：到目前为止，所遇到的所有java程序，有哪些是有顺序要求的呢？
		第一：对于一个方法来说，方法体中的代码都是有顺序的，遵循自上而下的原则
		第二：静态代码块和静态代码块之间有先后顺序
		第三：静态代码块和静态变量是有先后顺序的
*/