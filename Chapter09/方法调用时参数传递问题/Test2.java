/*
	Java中关于方法调用是，不管是基本数据类型还是引用数据类型，实际在传递时都是将变量中的值复制一份传递过去
*/

public class Test2
{
	public static void main(String[] args) {
			Person p = new Person();
			p.age = 10;
			add(p);
			System.out.println("main--->"+p.age);
	}

	public static void add(Person p) { //引用数据类型p
		p.age++;
		System.out.println("add--->" + p.age);
	}
}

//两个p.age应该都是11，因为堆内存中的p.age改变了，而p存的只是一个对象的地址，指向的对象并没有改变


class Person 
	{
		int age;

	}
