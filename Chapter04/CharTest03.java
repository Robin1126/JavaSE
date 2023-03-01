/*
	1. 整数值可以直接赋值给char类型
	2. char x = 97； 这个Java语句是允许的，并且输出为a
		第一个结论：当一个整数值赋值给char时，会自动转换成为char字符型，最终结果是一个字符
		第二个结论：当一个整数没有超出byte short char的取值范围时，可以直接赋值给byte short char
	
*/

public class CharTest03 {
	public static void main(String[] args) {
		char c1 = 'a';
		System.out.println(c1);

		char c2 = 97; //这里直接赋值成为了a，char类型
		System.out.println(c2);

		char c3 = 65535;
		System.out.println(c3); //这个也是一个字符

		// char c4 = 65536; 不兼容的类型，强行转换会有损失
	}
}