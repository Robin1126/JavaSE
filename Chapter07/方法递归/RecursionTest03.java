/*
	使用递归，写出一样的程序
	求1~n的和就相当于求1~n-1的和再加上n
*/

import java.util.Scanner;
public class RecursionTest03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n = s.nextInt();
		
		System.out.println("1~" + n + "的和是" + sum(n));
		
	}

	public static int sum(int x) {
		if (x == 1)
		{
			return 1;
		}else {
			return x + sum(x - 1);
		}
		
		//只有sum(1)执行完以后才return到sum(2)执行 2+sum(1) ,然后再将结果3 返回到最外面的 sum(3) return 3 + sum(2)
	}
}