
/*
	空指针异常只有在“空引用”访问“实例”相关的数据时候才会出现
*/

public class StaticTest03 {
	public static void main(String[] args) {
		System.out.println(Chinese.country);
		
		Chinese c1 = new Chinese("123123", "lbb");
		System.out.println(c1.country);
		//使用引用可以访问静态变量吗？可以！没毛病
		//因为每个对象都有这个属性，只不过这是一个静态属性
		//实例变量一定要使用引用.来访问
		//静态变量可以用类名.，也可以使用引用.来访问
		//但是会让程序员产生困惑，以为是实例变量
		
		//这里会出现空指针异常吗？
		c1 = null;
		System.out.println(c1.country); //不会出现空指针异常，因为静态的不需要对象
		//以下的代码实际上运行会看成 Chinese.country 因为编译器知道这个是静态变量
		
	}
}

class Chinese
{
	String idCard;
	String name;
	
	static String country = "中国";

	public Chinese(String x, String y) {
		idCard = x;
		name = y;
	}
}

