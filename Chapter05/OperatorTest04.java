/*
	赋值运算符：
	1.赋值运算符包括基本的和扩展的
	2. 基本运算符？


	3. 扩展的赋值运算符？
		注意！扩展运算符在编写时两个符号当中不能有空格
		+=
		-=
		*=
		/=
		%=

*/



public class OperatorTest04 {
	//赋值运算符右边的优先级比较高，先执行右边的表达式
	//然后将表达式赋值的结果放到左边的变量当中
	public static void main(String[] args){
	int i = 10;
	i = 20;

	byte b = 10;
	b = 20;

	/*
		以加等+=为代表学习	
	*/

		int k = 10;
		k += 20; //k变量增加20
		System.out.println(k);

	//研究：
	//i = i + 10 和 i += 10 完全一样吗？
	//答案：不一样，并不是完全相同，只是相似

	byte x = 100;
	System.out.println(x);

	//x = x +1;不可以，1是int类型
	x += 1;//+=1就可以了，没有
	// 使用扩展运算符，永远都不会改变数据类型，也就是+=1时，x永远都是byte
	// 其实 x += 1 是在带强制转换符

	x += 199;
	System.out.println(x);//44 自动损失精度

	int y = 100;
	y += 100;
	System.out.println(y);

	y -= 100;
	System.out.println(y);

	y *= 10;
	System.out.println(y);

	y /= 30;
	System.out.println(y);

	y %= 10;
	System.out.println(y);


	}
}