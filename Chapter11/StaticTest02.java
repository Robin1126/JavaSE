/*
	什么时候变量声明为实例？什么时候变量声明为静态？
		如果一个类型的所有对象的某个属性值都是一样的，就建议定义为类级别的静态变量。这样只在方法区的内存空间中保留一份，节省空间

		一个对象一份的是实例变量，所有对象共一份的是静态变量。关键就是看一个属性，会不会随着对象的差异而有所变化
*/

public class StaticTest02 {
	
	int i; //要不要加static
	
	public static void main(String[] args) {
		Chinese c1 = new Chinese("123123123","lbb"); //方法都会在内存的栈内存当中压栈
		System.out.println(c1.idCard);
		System.out.println(c1.name);
		//静态变量应该用类名.的方式进行访问
		System.out.println(Chinese.country);

		Chinese c2 = new Chinese("123412341","zky");
		System.out.println(c2.idCard);
		System.out.println(c2.name);
	}
}


//定义一个类：中国人

class Chinese {
	//身份证号
	String idCard; //每一个人的身份证号都不同，应该一个对象一份，即实例变量
	//姓名
	String name; //姓名也是一个人一个，也是一个对象一份，即实例变量
	//国籍
	static String country = "中国";//这个类本身就是中国人，国籍都是中国，不会随着对象的改变而改变，是属于整个类的特征
	//重点！！！！加static的变量叫做静态变量，在类加载时初始化，不需要new对象，静态变量在类加载时就分配了空间，并且存储在方法区



	//无参数
	public Chinese() {
		
	}
	
	//有参数
	public Chinese(String s1, String s2) {
		idCard = s1;
		name = s2;
	}
	//对于Chinese这个类来说国籍不会随着对象的变化而变化，如果采用实例变量会浪费内存

	//java中一共有三大类变量
	//局部变量存储在栈中	 
	//实例变量存储在堆中 对象级别
	//静态变量存储在方法区当中 类级别
}


