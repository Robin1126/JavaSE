//任何一个方法体的代码都是从上而下的顺序依次执行的

//main方法最先执行，最后结束


public class MethodTest05 {
	public static void main(String[] args) {
		System.out.println("main begin");
		m1();	
		System.out.println("main end");
	}
	//调用方法不一定要在main方法中，不要把main方法特殊化，main方法也是一个普通的方法
	public static void m1() {
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 end");
	}

	public static void m2() {
		System.out.println("m2 begin");
		T.m3();
		System.out.println("m2 end");
	}
}

class T
{
	public static void m3() {
		System.out.println("m3 begin");
		System.out.println("T's m3 method execute!");
		System.out.println("m3 end");
	}
}