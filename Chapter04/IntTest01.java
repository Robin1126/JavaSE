/*
	整数型在Java当中共有4种
		byte
		short
		int
		long
	
	1个字节=8个2进制位
	1byte = 8 bit

	以上4个最主要使用的就是int，
	取值范围是 -2147483648 ~ 2147483647 超了这个范围再考虑使用long
	开发的时候直接使用int就完事了！

	在Java语言中，整数型字面量有4种表示方式
		十进制：最常用的
		二进制
		八进制
		十六进制
*/




public class IntTest01 {
	public static void main(String[] args) {
		//十进制
		int a = 10;
		System.out.println(a);
		
		//八进制
		int b = 010; // 十进制 8
		System.out.println(b);
		
		//十六进制
		int c = 0x10; // 十进制10，十六进制以0x开头
		System.out.println(c);
		
		//二进制
		int d = 0b10; // 十进制2, 二进制以0b开头
		System.out.println(d);
	}
}