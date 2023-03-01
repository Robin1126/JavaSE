/**/

public class Overload04 {
	public static void main(String[] args) {

		//println()是一个方法名
		//这个方法是SUN公司的Java团队写的，可以直接使用
		//而且这个肯定是个overload方法，因为对于不同参数类型，输出都不一样
		System.out.println(10);
		System.out.println(3.14);
		System.out.println(true);
		System.out.println("abc");
		System.out.println('a');

		//调用m方法
		m(100);
	}

	public static void m(int x) {
		
	}
}