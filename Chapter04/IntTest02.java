/*
	在Java有一条非常重要的结论，整数型的字面量/数据被当作int来处理
	如果希望改整数型被当作long处理，必须添加后面添加L/l
	建议使用大写L，因为小写l和1分不清
*/


public class IntTest02 {
	public static void main(String[] args) {
		//100这个字面量是被当作int类型的处理的
		//所以他直接赋值给a没有任何的问题，不存在任何的类型转换
		int a = 100;
		System.out.println(a);

		long b = 100L; //这里不存在类型转换，直接long类型的字面量
		b = 200; //这里自动转换了类型 int 转换了 long
		//long的容量大，int的容量小，小的转换成为大的没有问题，称为自动转换
		System.out.println(b);

		long c = 300L; //这里不存在类型转换
		System.out.println(c);

		//题目
		long d = 2147483647; //int的最大值，这里可以自动类型转换
		// long e = 2147483648; 报错，整数太大了，int容纳不下 不会自动转换
		// 一上来就会先把 2147483648 看作int类型，所以一上来就会报错

		long e = 2147483648L; //上来就是long类型，这样就不会报错
		System.out.println(e); //这样就ok了！
	}
}