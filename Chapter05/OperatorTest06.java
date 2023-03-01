/*
	+ 运算符：
		1. +运算符有两个作用
			作用1：求和
			作用2：字符串拼接
		2. 什么时候求和？什么时候拼接？
			当+运算符两边是数字，求和
			当 + 运算符两边任意一边是字符串，那就是拼接

		注意：字符串拼接完以后还是一个字符串
*/


public class OperatorTest06 {
	public static void main(String[] args) {
		int age = 35;
		//这里+号进行拼接操作
		System.out.println("年龄="+age);

		int a = 100;
		int b = 200;
		int c = a + b; //求和运算

		System.out.println(c);

		System.out.println(a+b+"110");
		//当有多个加号的时候，自左向右进行运算
		//上面第一个加号先运算，先求和，求和之后再和110连接
		//因此最后结果是300110
		System.out.println(a+(b+"110"));//结果是100200110 直接两个连接
		//加号的用法比较灵活

		//在控制台上输出100+200=300
		int a1 = 100;
		int a2 = 200;
		int a3 = a1 + a2;
		System.out.println(a1+"+"+a2+"="+a3);//拼接的作用~
		System.out.println(a1+"+"+a2+"="+a1+a2);//直接就是拼接作用，结果是100200

		//Java中如果定义字符串类型？
		//用string，属于引用数据类型

		String name = "罗彬彬";//这里注意String要大写
		
		System.out.println("登录成功，欢迎"+name+"回来！");
		//要会字符串的拼接，会把变量放回来

		//口诀：要的地方加两个双引号，里面加上+号，最后中间放上变量名"+name+"
	}
}