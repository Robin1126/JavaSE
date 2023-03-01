/*
	1. 计算机任何情况下都只能识别二进制
	2. 计算机在底层存储数据的时候，一律存储的都是二进制的补码形式
		因为使用补码是因为效率最高
	3. 什么是补码？
		二进制有 原码、补码、反码
		对于一个正数来说，原码，补码，反码完全相同
		对于一个负数来说，拿byte i = -1来说
		原码就是 10000001
		反码就是 11111110 第一位的符号位不变
		补码就是反码+1  11111111
	4. byte b = (byte)150; b转换以后是多少？
		分析：int 类型的150 就是 00000000 00000000 000000000 10010110
		现在转换byte以后，前面3个字节砍掉 就是 10010110
		千万要注意，存储的是二进制补码形式
		也就是说 10010110是一个补码
		补码-1得到反码 10010101
		取反得到原码   11101010 看后面的1101010是106
		最后算上负号就是-106
*/



public class IntTest05 {
	public static void main(String[] args) {
		byte b = (byte)150; //肯定会报错，因为150超出了127范围
		System.out.println(b); // 输出-106
	}
}