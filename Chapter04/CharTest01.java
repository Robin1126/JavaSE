/*
	字符型：
		char
		1. char占有2个字节
		2. char采用unicode方式
		3. char的取值范围0-65535
		4. char的字面量用单引号括起来
		5. 汉字占用2个字节，正好可以放在char里面
		*/

public class CharTest01 {
	public static void main(String[] args) {
		
		char c1 = '中';
		System.out.println(c1);
		
		char c2 = 'a';
		System.out.println(c2);
		
		char c3 = '0';
		System.out.println(c3);

		// 注意：char c4 = "a"; String类型无法转换为char
		// char c5 = 'ab'; 未结束的字符文字，第一个a之后找一个单引号结束，但是没有找到
	}
}