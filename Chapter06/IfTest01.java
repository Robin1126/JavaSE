/*
	if语句的语法结构和原理
		if是分支语句，也叫条件语句
		第一种写法
			if{布尔表达式，结果是布尔表达式} {
				java语句；
			}

			这里的一个大括号成为一个分支
	该语法的执行原理，如果布尔表达式为true就执行大括号中的程序，否则不执行
		
		第二种写法
		if{布尔表达式} {
				Java语句；
			}else {
				Java语句；
			}

			这就有了分支，如果满足条件执行分支1，否则执行分支2.
			这种写法保证一定会有一种分支被执行

		第三种写法
		if{布尔表达式1} {
		}else if {布尔表达式2} {
		}else if {布尔表达式3} {
		}else if {布尔表达式4} {
		}...
		一个一个按顺序判读布尔表达式，直到满足其中一个是true，就执行当前的布尔表达式，然后就结束了。条件是从上往下依次判断

		第四种写法
		就是第三种写法的最后面加入一个else
		就是之前的都不成立的情况下，执行最后一个。

			注意 
			1.对于if语句来说，只能有一个分支执行，不可能存在两个或两个以上的分支执行，也就是最多只能有一个分支执行。if语句当中值要有一个分支执行了就结束了
			2. 以上4种当中，第二和第4种因为有else分支，一定会执行。1，3两种因为没有else，所以会导致有可能不执行if语句
			3. 当分支当中Java语句只有一条，那么大括号可以省略，但是为了可读性，可以省略。但是不建议省略
			4. 嵌套的时候最好一个语句一个语句分析，不要冗杂在一起分析
*/



public class IfTest01 {
	public static void main(String[] args) {

		boolean sex = true;
		// true表示男，false表示女
		if (sex)
		{
			System.out.println('男');
		}else{
			System.out.println('女');
		}
		
		//可以再进一步改良，使用三目运算符
		sex = false;
		System.out.println(sex?'男':'女');

		//代码可以这样写吗？
		if(sex = true) { //不管以前sex是什么，现在都是赋值给了true
			System.out.println('男'); //这会永远执行第一个，这里直接赋值了sex。只要里面括号里面是布尔类型的值就行
		}else{
			System.out.println('女');
		}

		int i = 100;
		if (i == 100) System.out.println("i的值是100");//大括号省略，分支中只有一条Java语句
		//这里加一条语句 System.out.println("Hello,ZKY");就会导致系统认为上面的if结束了，从而报错下面的else没有if
		else System.out.println("Hello,World!"); //这个也没问题，每个分支一个语句不需要加括号
		//但是如果不加括号的情况下，系统默认只有一条执行语句，再加语句就相当于if分支之外的了！
	}
}