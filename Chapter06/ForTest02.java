/*
	1. for循环的语法机制以及运行原理？
		语法机制：
			for(初始化表达式;条件表达式;更新表达式)
			{循环体}
			
			注意：初始化表达式最先执行并且只执行一次
					条件表达式是布尔类型，结果是true或者false
				
				执行原理：先执行初始化表达式，然后看条件表达式，如果为true，执行循环体，然后进行更新表达式
								然后继续判断条件表达式，直到条件表达式为false，中止循环
				
				更新表达式是为了更新某个变量的值，防止死循环。


			*/


public class ForTest02 {
	public static void main(String[] args) {
		for (int i = 0;i < 10 ;i++)//如果for(;;)不带任何内容也是可以的，只不过是一个死循环
		{
			System.out.println("i = "+i);//执行10次，输出0-9
			//i只能在for循环里面用，出了循环以后就没了
			//i在main方法中没法直接使用
		}
		int i = 0;
		for (;i < 10 ;i++ )
		{
			System.out.println("i --> "+i);
		}

		for (int k = 1;k <= 10 ;k++ )
		{
			System.out.println("k --> "+k);
		}

		for (int k = 1;k<= 10 ; )
		{
			System.out.println("k = "+k);
			k++;//仍然输出1-10
		}
		//变形
		for (int k = 1;k<=10 ; )
		{
			k++;
			System.out.println("k -> "+k);
		} //输出2到11
	}
}