/*
	1.在Java中任何有效代码都必须写道类体当中，最外层必须是一个类的定义

	2. public表示公开的，class表示定义一个类，Test是一个类名。后面必须跟这一对大括号，成对编写

	3. 什么时候代码缩进？
		我包着你，你就比我低一级，你就需要缩进
		没有合理的缩进，代码的可读性就很差

*/

public class Test { //定义一个类，类名是Test	
	//类体

	//整个这一块叫做main方法，程序的入口
	//也就是说，JVM执行程序时候，会主动去找这样的一个方法，没有这个main方法，程序就无法执行
	// 注意：方法都是放在类体当中的，不能放在类体的外面
	// public没有的话可以编译，符合语法，但是不能执行
	// main方法只能有一个，也就是说整个程序的入口只能有一个


	public static void main (String[] args) { //args可以改名字，main方法只有这个位置可以改名字
		System.out.println("Test1"); //字符串用双引号成对写出来
		System.out.println("Test2");	//System.out.println();代表了要输出一条语句到控制台
	}

	public static void main2 (String[] args) {
		System.out.println("hehe");
	}
	//类体当中应该是方法，而不是具体的java语句
	//也就是说，System.out.println()并不能在方法外面存在
	//分号代表了一条语句的结束，方法体中的代码依照顺序从上到下依次逐行执行
}