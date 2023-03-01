/*
	1.输出信息到控制台
		System.out.println(...)
	2.在Java中如何接受键盘的输入呢
		面向对象有关
*/
public class KeyInput {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		//创建一个对象
		System.out.print("请输入一个整数值，按回车结束：");
		
		int userInput = s.nextInt();
		//接收用户的输入，从键盘上接收一个int类型的数据
		//代码执行到这里时候，会暂停下来等待用户的输入整数然后回车
		//userInput变量就有值了
		System.out.println("您输入的值是："+userInput);

		//如何接收字符串呢？
		System.out.print("请输入一个字符串：");
		String str = s.next();//next()方法,接收字符串
		System.out.println("您输入了："+str);

		System.out.print("请输入用户名：");
		String name = s.next();
		System.out.println("欢迎回来，"+name+"!");
	}
}