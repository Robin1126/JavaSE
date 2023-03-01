/* 
	在Java当中有一个语法规则，那就是整数型的字面量没有超过byte的取值范围的时候，那么这个整数型的字面量可以直接赋值给byte类型的变量。
*/

public class IntTest04 {
	public static void main(String[] args) {
		// 300 被默认成为int类型
		// 要想通过编译要强制转换，但是会损失精度
		byte b = (byte)300;
		System.out.println(b); 
		// 300对应二进制是 0000 0001 0010 1100，强制转换后只剩下0010 1100 也就是44
		byte x = 1; // 这里可以通过，因为没有超过byte的范围
		byte y = 127; //都是可以编译通过的
		// 这种语法机制都是为了方便写代码而存在的

		short s = 1;
		short s1 = 32767; // short 取值范围是 -32768~32767
	}
}