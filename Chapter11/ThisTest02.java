public class ThisTest02 {
	int i = 100;

	static int k = 111;

	public static void main(String[] args) {
		ThisTest02 a = new ThisTest02();
		System.out.println(a.i); //不可以，i是实例变量，相当于this.i
		System.out.println(ThisTest02.k); //静态变量通过类.方式访问

		//所有东西都有自己的访问规律，不能乱来
		//注意分清楚是static还是不是static的
		//this不能和static共存
		//构造方法是[修饰符] 类名(参数) {}
		//成员变量方法是 [修饰符] 数据类型 get+成员变量首字母大写（参数）
		//this在某些情况下是不能省略的
	}
}