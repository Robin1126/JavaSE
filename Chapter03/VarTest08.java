/*
	变量的作用域：
	1. 什么是作用域？
		变量的有效范围
	2. 关于作用域：一句话，出了大括号就不认了
	3. java中有一个很重要的原则：就近原则
		哪个离我近，就访问哪个。
*/


public class VarTest08 {
	int i = 10000; //不在同一个域当中声明是可以的，也就是下面main方法中的i跟这里的成员变量i不冲突

	public static void main(String[] args) {
		int i = 100;
		System.out.println(i);

		for(int n = 0; n < 10; n++) {
			
		} //for循环里面的n只在for的大括号里面，出了大括号以后就不能用了
		//System.out.println(n);

		int k;
		for( k = 0; k < 10; k++) {			
		}
		System.out.println("k="+k);
	}
	//出了main的大括号，就不能访问i了
	public static void x() {
		int i = 200; // 这个i的有效范围是在x方法里面，跟上面的i不冲突
	}
}