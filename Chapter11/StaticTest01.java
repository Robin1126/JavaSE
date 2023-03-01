/*
	static
		1. static翻译为静态的
		2. 所有static修饰的都是类级别的，类相关的
		3. 所有static修饰的都是采用 类名.的方式访问的
		4. static修饰的变量，静态变量
		5. static修饰的方法，静态方法

	变量的分类
		变量根据声明的位置进行划分：
			变量在方法体当中声明的，叫做局部变量
			变量在方法体外，类里面声明的变量，叫做成员变量

		成员变量又可以分为
			实例变量：
			静态变量：

*/

public class StaticTest01 {

}

class VarTest {
	
	//以下都是实例相关的，访问时候使用引用.的方式访问，需要先new对象
	//可能发生空指针异常
	int i; //成员变量当中的实例变量

	
	public void m2() {
		
	} //实例方法
	
	//以下都是静态相关的，访问时通过类名.的方式访问
	//不需要new对象，没有空指针的异常发生
	static int k; //成员变量当中的静态变量
	public static void m1() {
		
	}	//静态方法


}