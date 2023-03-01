//import Student;
public class StudentTest01 {
	public static void main(String[] args) {
		
		
		//这里可以访问Student类
		/*
			创建对象的语法是什么？
				new 类名();
			类是模板，通过类是可以创建对象的
			new是一个运算符
		*/
		int i = 100;
		System.out.println("i = " + i);

		//如何接受这个类型

		//java中所有的类都属于引用数据类型
		//Student是一个类名，同时也是一个类型名，只不过是自己定义的
		Student s1 = new Student(); //这样就创建出来了类

		//再创建一个对象
		Student s2 = new Student(); //以后通过s1，s2就可以访问对象了

		Student s3 = new Student();

		//以上的这个程序就相当于通过学生类实例化了3个学生对象
		//编译的时候先编译Student.java 生成一个类，这里才能用

	}
}