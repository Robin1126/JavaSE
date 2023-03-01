public class SuperTest02{
	public static void main(String[] args) {
		new C();
	}
	
}
//预测结果应该是 A类无参数，B类有参数String，C类有参数String,int C类有参数String C类无参数
//老祖宗object类的无参数构造方法一定会最先执行，处于栈顶，last in first out

class A{
	public A() {
		System.out.println("A类的无参数构造执行！");
	}
}

class B extends A {
	public B() {
		System.out.println("B类的无参数构造执行！");
	}

	public B(String name) {
		System.out.println("B类的有参数构造执行！(String)");
	}
}

class C extends B{
	public C() {
		this("lbb");
		System.out.println("C的无参数构造执行");
	}

	public C(String name) {
		this(name,20);
		System.out.println("C类的有参数构造执行(String)");
	}
	
	public C(String name, int age) {
		super(name);
		System.out.println("C类的有参数构造执行(String,int)");
	}
}