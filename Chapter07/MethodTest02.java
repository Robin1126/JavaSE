/* 
	初步体验方法的好处

	注意：先执行main方法。因为main方法是一个入口
	java中的所有方法体当中的代码都必须自上而下的顺序逐行执行
	除了main方法以外，其他都需要程序员手动调用执行。不调用的时候是不执行的

	方法定义在类体当中，方法定义的先后顺序没有关系。
*/

public class MethodTest02 {
	public static void main(String[] args) {
		//需求1：请编写程序，计算100和200求和
		//需求2：计算666和888的和
		//需求3：求111和222的和
		sumInt(100,200); //调用方法要结束了才可以执行下一行
		sumInt(666,888);
		sumInt(111,222);

		//main方法结束就代表这个程序就结束了
	}
	//这里没有讲解方法的定义，以及方法的调用
	//专门在这个类体当中定义一个方法
	//方法就是可以完成某一种功能的代码片段，并且可以重复使用
	public static void sumInt(int x, int y) {
		int z = x + y;
		System.out.println(x + "+" + y + "=" + z); //可以理解为一套工具
		//x y z在方法调用结束之后就释放了
		//x y z都是局部变量
	}
}