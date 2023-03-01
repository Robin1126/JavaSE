public class NullPointerTest {
	public static void main(String[] args) {
		User u = new User();
		System.out.println(u.id);

		u.doSome();

		u = null;//引用变成空了，造成空指针异常
		//一个实例方法的调用也必须有对象的存在
		//对象没了也就不能调用对象的方法
		//这个也是实例相关的数据：1. 实例变量 + 实例方法
	}
}

class User {
	int id;

	public void doSome(){ //对象相关的方法，模拟的是对象的行为
		System.out.println("do some!");
	} //带上static的方法都是类的方法
}