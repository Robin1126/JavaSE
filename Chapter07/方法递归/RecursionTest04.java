/*
	使用递归的方式计算N的阶乘
*/

public class RecursionTest04 {
	public static void main(String[] args) {
	
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个自然数：");
		int n = s.nextInt();
		if (n < 0)
		{
			System.out.println("输入的数字不合法！");
			return;
		}

		System.out.println(n + "的阶乘是" + factor(n));
	}

	public static int factor(int x) {
		if (x == 0 || x == 1)
		{
			return 1;
		}else {
			return factor(x - 1) * x;
		}
	}
}