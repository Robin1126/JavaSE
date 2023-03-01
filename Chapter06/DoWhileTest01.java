/*
	do...while循环语句的执行原理和语法机制：
		语法机制：
			do {
				循环；
				}while(); 大括号代表结束，小括号没有结束的能力，因此要加上;
			
			执行原理：
			 上来先执行一次循环体，先斩后奏。然后再判断是不是要继续执行
			 因此执行次数是1-n次
*/


public class DoWhileTest01 {
	public static void main(String[] args){
		int i = 0;
		do
		{
			System.out.println(i++);//这个跟后面补一个i++是一样的
		}
		while (i < 10); //0-9输出
	
		System.out.println("----------");
		i = 0;
		do
		{
			System.out.println(++i); //输出1-10
		}
		while (i < 10);

	}
}