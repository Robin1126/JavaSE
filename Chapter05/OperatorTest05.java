/*
	条件运算符:
		语法格式 布尔表达式？表达式1：表达式2
	前面的如果为真，执行表达式1，为假，执行表达式2

*/




public class OperatorTest05 {
	public static void main(String[] args) {
		// 出错 不是java语句 100;
		// 表示声明一个变量
		int i = 100;
		

		boolean sex = false;
		
		char c = sex?'男':'女';//这样就可以了，有个变量接收数值
		// 编译器会检查后面的数据类型，因而"女"这种用双引号的字符串是不行的
		System.out.println(c);

		sex = true;

		//这样可以，system.out.print很厉害，什么数据都能放
		System.out.println(sex?'男':"女");
	}
}