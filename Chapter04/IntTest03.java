/*
	1. 小容量可以直接赋值给大容量，成为自动类型转换
	2. 大容量必须经过强制类型转换符才能赋值给小容量，但是要注意可能会有精度的损失


	
*/

public class IntTest03 {
	public static void main(String[] args) {
		long x = 100L;
		int y = (int)x; //x是long类型，占用8个字节，y占用4个字节
		//使用了(int)强制转换符
		System.out.println(y);
		// 底层是如何进行的呢？
		// 强行转换会强行将“前面”的四个字节砍掉！！

		//编译错误类型，大容量到小容量不能直接赋值给小容量
		//大容量如何转换成为小容量呢？
		//必须给大容量使用强制类型转换符号

		// 定义变量a int类型,值为100
		int a = 100;
		System.out.println(a);

		int b = a; //把a的值复制一份给b
		System.out.println(b);
	}
}