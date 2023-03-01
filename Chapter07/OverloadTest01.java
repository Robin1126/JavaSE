/*
	方法重载机制？
		1. 以下程序先不使用方法重载机制，分析程序的缺点？？？
			以下程序的代码风格的缺点是什么

			sumInt(),sumLong(),sumDouble()

			三个方法功能不同，但是相似，起了不同的名字

			缺点包括2个：
			第一：功能相似,都是相似，起了3个方法不美观
			第二：程序员需要记住更多的方法名称

			为了解决这个问题，诞生了overload方法重载机制
*/

public class OverloadTest01 {

	public static void main(String[] args) {
		int x = sumInt(10,20);
		System.out.println(x);

		long y = sumLong(10L, 20L);
		System.out.println(y);

		double z = sumDouble(10.0, 20.0);
		System.out.println(z);
	}

	
	//定义一个int类型的求和方法
	public static int sumInt(int a, int b) {
		return a + b;
	}

	//定义一个long类型的求和方法
	public static long sumLong(long a, long b) {
		return a + b;
	}
	
	//定义一个double类型的求和方法
	public static double sumDouble(double a, double b) {
		return a + b;
	}

}