public class StaticTest04 {
	public static void main(String[] args) {
		StaticTest04.doSome();
		//这是正规的访问方式，类名.方式调用静态方法

		StaticTest04 st = new StaticTest04();
		st.doOther();
		st.doSome();

		st = null;
		st.doSome(); //不会出现空指针
		//但是st.doOther();就不行了
	}

	//静态方法不需要new对象，直接使用类名.来访问
	//但是也可以使用引用.来访问
	public static void doSome() {
		System.out.println("执行了doSome()");
	}

	//实例方法都需要new对象，使用引用.来访问
	public void doOther() {
		System.out.println("执行了doOther()");
	}
}