/*
	结论：byte，short，char做混合运算的时候，是各自先转换成为int再做运算
*/


public class IntTest06 {
	public static void main(String[] args) {
		char c1 = 'a'; //整数位就是97
		byte b = 1;
		System.out.println(c1+b); //这里的加号是负责求和

		//short s = c1 + b; //编译报错，编译器不知道加法的最后结果是多少，只知道是一个int类型
		//所以要将c1+b的结果转成short类型

		short s = (short)(c1+b);//也要注意优先级问题，要加括号

		int a = 1;
		short x =(short)a; //直接赋值a是不可以的，因为编译器“只知道”类型，不知道结果，前面还是要加上强制转换
		System.out.println(x); //short x = 1;可以，short x = a就不行

		//也就是说，直接写数字和做运算是不一样的
	}
}