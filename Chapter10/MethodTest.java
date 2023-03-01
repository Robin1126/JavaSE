//带有static和没有static的方法分别怎么调用
//实例相关的都需要先new对象，通过引用.的方式去访问

public class MethodTest {
	public static void main(String[] args) {
		MethodTest.doSome();
		doSome(); //在同一个类中可以省略

		//先创建对象
		MethodTest mt = new MethodTest();
		mt.doOther(); //先有对象才可以引用方法
		//格式是对象.方法名（）
	}

	//待用static的方法用类名.的方式访问
	public static void doSome() {
		System.out.println("do some!");
	}

	//不带static的称为实例方法（对象方法，对象级别的方法）
	//目前死记硬背

	public void doOther() {
		System.out.println("do other...");
	}

}