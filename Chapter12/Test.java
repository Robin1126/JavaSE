//蓝色是关键字，黑色是标识符
//其实System也是标识符
//在editplus中的红色字体表示这个类是sun的jdk写好的一个类

public class Test {


	//静态变量
	//静态变量可以通过类名.的方式进行使用
	//当然了，静态的变量也可以通过new对象的方法进行使用

	static Student stu = new Student(); //保存的是一个地址

	//入口
	public static void main(String[] args) {
		Test.stu.exam();

		System.out.println();
	}
}

class Student {
	public void exam() {
		System.out.println("考试。。。。");
	}
}

