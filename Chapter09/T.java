public class T
{
	A a;

	public static void main(String args) {
		D d = new D();
		C c = new C();
		B b = new B();
		A a = new A();
		T t = new T();
		c.d = d;
		b.c = c;
		a.b = b;
		t.a = a;

		//编写代码通过t来访问d中的i
		System.out.println(t.a.b.c.d.i);

		//如果不赋值，不能直接t.a.b.c.d.i
		//因为变量里面没有地址
		//异常是NullPointerException（空指针异常）
	}
}

class A
{
	B b;

}

class B
{
	C c;
}

class C
{
	D d;
}

class D
{
	int i;
}