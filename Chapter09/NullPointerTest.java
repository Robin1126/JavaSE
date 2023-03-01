/*
	空指针异常：NullPointerException
*/

public class NullPointerTest {
	public static void main(String[] args) {
		Customer c = new Customer();
		System.out.println(c.id);

		c.id = 9527;
		System.out.println("客户的id是=" + c.id);

		c = null; //c现在不保存地址了
		//但是原来内存当中的9527还在
		System.out.println(c.id);//编译器能通过，因为从语法上讲，Customer类型的对象是有一个成员变量id的
		//但是c现在不存地址了，所以无法通过地址寻址出现NullPointerException
		//Customer c = new Customer(); 赋值的是地址

		//Java中的垃圾回收器GC主要针对回收的是堆内存当中的垃圾数据，什么时候回收呢？
		//当没有任何引用指向该对象的时候
	}
}

	class Customer 
	{
		int id;//成员变量中的实例变量，应该先创建对象，然后通过引用的方式访问
	}
