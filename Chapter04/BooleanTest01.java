/*
	1. 在Java语言种boolean类型只有两个值，没有其他值：
	true和false
	不像c或者c++，c语言也可以用1和0来表示布尔类型

	2. 布尔类型在实际开发中使用在哪里？
		使用在逻辑判断当中，通常放在条件位置上

*/


public class BooleanTest01 {
	public static void main(String[] args) {
		//boolean sex = 1; 不兼容的类型，int转换为boolean

		boolean sex = false;
		//if是一个条件语句，如果A账户有钱才可以给B账户转钱
		//例如：这个布尔类型是true为男性，false为女性

		if(sex) {
			System.out.println("男");
		}else {
			System.out.println("女");
		}

		int a  = 10;
		int b = 5;
		System.out.println(a<b); //这个为假
		System.out.println(a>b); //这个为真

		boolean flag = a < b; //等号右边先执行
		System.out.prinln(flag); //true

		//运算符是有优先级的，不确定可以现加小括号
		//比如 a=i++ 就是先把i拿去用再加1，a=++i就是i先加1再赋值给a


	}
}