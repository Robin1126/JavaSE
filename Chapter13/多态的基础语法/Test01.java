/*
	多态的基础语法：
		1. 学习多态语法之前，我们需要普及两个概念
			第一个：向上转型 自动类型转换
				子 --> 父 子转父 等号左边是父类型引用
			第二个：向下转型 强制类型转换，需要加强制类型转换
				父 --> 子 父转子 等号左边是子类型引用
		注意：
			java中允许向上也允许向下转型
			*****但无论是向上还是向下转型，两种类型之间必须存在继承关系，否则编译器报错

			自动类型转换和强制类型转换都是使用在基本数据类型的。

		2. 多态指的是：
			父类型引用指向子类型对象。
			包括编译阶段和运行阶段。
			编译阶段：绑定父类型方法
			运行阶段：动态绑定子类型方法

		3. java中只有类名或者是引用才能去.
			类名.
			引用.

			只要你想.前面一定是个类名，或者是一个引用
			
			System.out.println() 中在System里面有一个class Out，然后新建一个引用 Out out = new Out(); 这个对象里面就有这个方法println（）
			至于为什么用静态变量是因为静态变量是存在方法区里面的，类加载的时候就产生了，这样不需要在运行过程中再去new对象
*/

public class Test01 {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.move();

		Cat c1 = new Cat();
		c1.move();

		Bird b1 = new Bird();
		b1.move();

		//代码可以这样写吗？
		
		/*
			1. Animal和Cat之间有继承关系
			2. Animal是superclass，Cat是subclass
			3. Cat is Animal
			4. 经过测试知道Java支持这样的一个语法
				父类型的引用指向子类型的对象
		*/
		Animal a2 = new Cat(); // new Cat()子类型对象 转到 父类型变量里面
		Animal a3 = new Bird();//这是向上转型
		//Cat c2 = new Animal();//这是向下转型 父类型对象 转到 子类型变量

		//这种不行，没有继承关系 Dog d1 = new Animal();
		
		//调用方法

		/*
			什么是多态？
				多种形态，多种状态
			分析：a2.move()
				java程序分为编译阶段和执行阶段
				先来分析编译阶段：
					对于编译器来说，编译器只知道a2的类型是Animal，编译器检查语法的时候，会去Animal.class的字节码文件中找到move方法，绑定上
					它并不会创建对象，所以编译通过。
					这是静态绑定
				运行阶段：
					实际上在堆内存中创建的对象是Cat，所以move的时候真正参与的对象是Cat，所以运行阶段会动态执行Cat的move方法
					这个过程称为运行阶段的绑定，属于动态绑定

				多态表示多种形态
					编译的时候是一种形态
					运行的时候是另一种形态
		*/
		a2.move(); //猫在走猫步
		a3.move(); //鸟儿在飞翔！

		Animal a5 = new Cat();

		//a5.catchMouse();这个是不行的，因为编译的时候，在Animal的class当中找不到catchMouse这个方法，编译不通过，静态绑定失败
		/*
		错误: 找不到符号
                a5.catchMouse();
		*/
		//也就是说 向上转型的时候，执行的只能是父类的方法
		
		//我非要调用catchMouse()怎么办
		//这时候就要使用向下转型了
		//如果你想调用的方法是子类中特有的，就要考虑使用向下转型了
		Cat x = (Cat) a5; //a5原来是Animal类型向下转型称为了cat类型
		x.catchMouse();

		//编译没问题，运行有问题，因为bird是无法catchMouse()
		Animal a6 = new Bird(); //表面上是Animal类型，实际上运行的是bird
		//Cat y = (Cat)a6; //有继承关系就可以向下转型，编译器检测到a6是animal类型，可以转型
		//y.catchMouse(); //java.lang.ClassCastException: class Bird cannot be cast to class Cat (Bird and Cat are in unnamed module of loader 'app')
		//cat和bird没有继承关系，bird不能转换成为cat
		//cast exception 类型转换异常

		//怎么避免这种异常呢？

		/*
		新的内容：运算符
			instanceof
			第一：instanceof可以在运行阶段动态判断引用指向的对象的类型
			第二：instanceof的语法
					（引用 instanceof 类型）
			第三：instanceof运算符的结果只能是true或者false
			第四：假设(c instanceof Cat)为true: 表示c这个引用指向的对象是一个Cat类型
					假设(c instanceof Cat)为false: 表示c这个引用指向的对象不是一个Cat类型
		*/
		if (a6 instanceof Cat) //任何时候只要是向下转型时，一定要使用instanceof进行判断，这是规范中要求的，可以很好避免class cast exception
		{
			Cat y = (Cat)a6;
			y.catchMouse();
		}
	}
}