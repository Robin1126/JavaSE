// 一行上可以声明多个变量吗？
// 可以的，用逗号,隔开就行
public class VarTest06 {
	public static void main(String[] args) {
		int a,b,c = 100; //这里只有c赋值了100
		
		a = 200;
		System.out.println(a);

		b = 300;
		System.out.println(b);

		System.out.println(c);
	}
}