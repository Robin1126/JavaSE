/*
	1. 除了静态代码块以后，还有一种语句块叫做：实例语句块
	2. 实例语句块并不会在类加载时执行
	3. 语法很简单 直接 { 实例语句块; }
	4. 实例语句块执行，必然在构造方法之前执行，自动执行“实例语句块”
		实际上这个也是SUN公司给程序员准备的构造对象时机，只要有需要就可以使用

	作用：由于实例语句块都是在构造方法执行前执行的，那么有一些语句是所有的构造方法都要执行的，那么就可能可以放到实例语句块当中而不是写到
	构造方法当中，减少代码的重复
	比如
	public InstanceCode() {
		System.out.println("bobo");
		System.out.println("无参数构造方法");

	}

	public InstanceCode(String name) {
		System.out.println("bobo");
		System.out.println("有参数的构造方法");
	}
	当中的System.out.println("bobo");就可以提出来写到实例语句块当中
	
*/


public class InstanceCode {
	public static void main(String[] args) {
		System.out.println("main begin");
		InstanceCode o1 = new InstanceCode();
		InstanceCode o2 = new InstanceCode();
	}
	
	//实例语句块
	//实例语句块并不会在类加载时执行
	{
		System.out.println("实例语句块执行");
	}
	

	//构造方法
	public InstanceCode() {
		System.out.println("无参数构造方法");

	}

	public InstanceCode(String name) {
		System.out.println("有参数的构造方法");
	}
}