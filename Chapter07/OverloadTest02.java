/*
	使用方法重载机制，解决之前的两个缺点。
	通过形式参数的数据类型来区分，而不是让方法名也不一样
	参数列表也可以区分方法，这种通过参数列表的区分方式叫做方法重载

	优点1：代码整齐，美观
	优点2：功能相似的，可以方法名相同，更容易后面的代码编写
*/

public class OverloadTest02 {
	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sum(10L,20L));
		System.out.println(sum(10.0,20.0));
	}


	public static int sum(int a, int b) {
		System.out.println("Int求和");
		return a + b;
	}

	public static long sum(long a, long b) {
		System.out.println("Long求和");
		return a + b;
	}

	public static double sum(double a, double b) {
		System.out.println("double求和");
		return a + b;
	}
}