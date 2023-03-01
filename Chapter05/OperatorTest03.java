/*
	逻辑运算符:
		& 逻辑与
		| 逻辑或
		! 逻辑非
		&& 短路与
		|| 短路或

		前面的都学过，重点在短路与，短路或

		注意！逻辑运算符两边都是布尔类型，并且结果也是布尔类型
		关系运算符的优先级要比逻辑的高 a>b & a>c 先运算>在运算&
*/

public class OperatorTest03 {
	public static void main(String[] args) {
	//与运算
		System.out.println(true & true); //true
		System.out.println(true & false); //false
		System.out.println(false & false); //false

	int a = 100;
	int b = 101;
	int c = 90;
		System.out.println("运算结果是"+(a<b & a>c));

	//或运算
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | false); 
	//非运算
		System.out.println(!false);//true

	/*
		关于短路与&&，短路或||
		其中重点学习短路与，短路或依葫芦画瓢

		短路与和逻辑与的区别 &&和&的区别
		首先这两个运算结果没有任何区别，完全相同
		只不过短路与&&会有短路现象

		什么是短路现象？


		什么时候用&&什么时候用&
	
	*/
	
	System.out.println(true & true);//true
	System.out.println(true & false);//false
	System.out.println(false & false);//false
	
	System.out.println(true && true); //true
	System.out.println(true && false); //false
	System.out.println(false && false); //false

	//理解什么是短路现象？什么时候会发生短路？
	int x = 10;
	int y = 11;
	System.out.println(x > y & x > y++);
	//逻辑与必须全是true结果才是true
	//当左边的x>y已经是false了，后面的就按道理来说不需要执行了
	System.out.println(y); //这里y++执行了，y变成了12
	
	int m = 10;
	int n = 11;
	System.out.println(m>n && m>n++);
	System.out.println(n);
	//当左边的表达式为false的时候，右边的表达式不执行，这种叫做短路现象
	//从效率来说，短路与的效率比逻辑与的效率高一些
	//同样的道理，短路或就是看前面的一项如果为true，则后面的不执行
	//大部分情况下都建议使用短路与，只有在表达式都需要执行的时候才用逻辑与
	}
}