/*
	1. super是一个关键字，全部小写
	2. super和this对比学习
		this：
			this出现在实例方法和构造方法中
			this的语法是this. this（）
			this不能使用在静态方法中
			this.除了在区分局部变量和实例变量的时候不能省略
			this()是用在构造方法中的第一行，代表通过当前的构造方法去调用别的构造方法，目的是代码复用
			下面的代码构造Date对象的时候，缺省构造器调用了有参数的构造方法，实现了初始化
			public Date() {
				this(1970, 1, 1); 
			}

			public Date(int year, int month, int day) {
				this.year = year;
				this.month = month;
				this.day = day;
			}

		super：
			super出现在实例方法和构造方法中
			super的语法是super. super（）
			super不能使用在静态方法中
			super.什么时候不能省略
			super()是用在构造方法中的第一行，代表通过当前的构造方法去调用父类中的构造方法，
			目的是：创建子类对象的时候，先初始化父类型特征

		3. super()
			表示通过子类的构造方法调用父类的构造方法，模拟现实世界中的场景：要想有儿子，必须先有父亲

		4. 重要的结论：
			当一个构造方法第一行：
				既没有this()又没有super()的话，默认会有一个super()
				表示通过当前子类的构造方法调用父类的无参数构造方法
				所以必须保证父类的无参数构造方法的存在

		5. this()和super()不能共存,它们都只能出现在构造方法的第一层

		6. 不管怎么折腾，父类的构造方法总是会执行

		建议：手动写一个类的无参数构造方法，否则可能在创建子类的对象的时候编译报错
*/

public class SuperTest01{
	public static void main(String[] args) {
		/*
			A类的无参数构造方法
			B类的无参数构造方法
		*/
		new B();//这里相当于先构造了一个A对象，再构造一个B对象
	}
}

class A {
	//建议手动写无参构造方法
	
	public A() {
		System.out.println("A类的无参数构造方法");
	}
	
	public A(int i) {
		
	}
}


class B extends A {
	/*
	public B() {
		super(100);//如果去掉就会默认是super();
		//这里其实有一个super()调用了父类的无参数构造方法
		System.out.println("B类的无参数构造方法");
	}*/

	public B() {
		this("lbb");
		//super(123);
		System.out.println("B类的有参数构造方法！");
	}
	
	public B(String name) {
		//super();
		System.out.println("B类的有参数构造方法(String)");
	}
}