/*
	while 循环：
		1. while循环的语法机制和原理：
		语法机制：
			while(布尔表达式) {
				循环体;
			}
		每次都判断布尔表达式，如果为真则执行循环体，直到布尔表达式为false
		while可能一次都不执行的

		2. while循环的循环次数是0-n次

		3. while循环的本质和for是一样的
			初始化表达式；
			while（布尔表达式）{
				循环体；
				更新表达式；
			}

*/


public class WhileTest01 {
	public static void main(String[] args) {
		
		for (int i = 0 ; i < 10 ;  )
		{
			i++;
			System.out.println("i --> "+ i);
		}
		
		
		int i = 0;
		while (i<10)
		{
			  i++;
			System.out.println("i --> "+i);
		
		}

		//上面这两个其实是一样的东西，只是语法格式不一样
	}
}