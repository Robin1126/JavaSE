/*
	只要带着S.class文件，那么所有的System.out.println()都可以换成S.p()
	这个就是代码的封装
*/


public class NewHelloWorld {
	public static void main(String[] args) {
		S.p("Hello, world!");
		S.p(100 + 200);
	}
}