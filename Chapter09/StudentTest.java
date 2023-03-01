public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.stuID);
		System.out.println(s1.name);
		System.out.println(s1.address);
		System.out.println(s1.gender);
		System.out.println(s1.age);
		//语法 引用.实例变量名

		Student s2 = new Student();
		//s1是局部变量，它在栈当中
		//在new的过程中就分配了堆内存给对象student
		//当执行赋值语句时候，实际上是把堆内存中的地址赋值给了栈内存当中的s1
		//像这种s1变量保存的是内存地址的变量，叫做引用
		//s1，s2叫做引用
		//不能通过类名直接访问变量
		s2.name = "LBB";
		s2.gender = true;
		s2.age = 31;
		s2.address = "韶关市武江区";
		s2.stuID = 54684;

		System.out.println("姓名=" + s2.name);
		System.out.println("学号=" + s2.stuID);
		System.out.println("年龄=" + s2.address);
		System.out.println("性别=" + s2.gender);
		System.out.println("住址=" + s2.age);

		//通过赋值的方式将实例变量的值修改了
		//还是比较简单的，只是多了一个引用，再加上实例变量
		//因为java没指针，无法直接访问内存地址，只能通过引用去访问
		//标识符可以有中文
	}
}