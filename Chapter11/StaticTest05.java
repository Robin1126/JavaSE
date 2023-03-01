/*
	关于方法来说，什么时候定义为实例方法？什么时候定义为静态方法？

	此方法一般都描述了一个行为，如果说该行为必须由对象去触发，那就定义为实例方法

	类 = 属性 + 方法
		属性描述的是：状态
		方法描述的是：动作

	一个方法代表一个动作

	那么，什么时候定义静态方法？什么时候定义实例方法？
		当一个方法当中访问了实例变量，这个方法一定是实例方法
		以后我们开发中，大部分情况下，如果是工具类的话，工具类当中的方法一般都是静态的
		静态方法直接使用类名.访问，十分方便，不需要创造对象
		工具类？以后再讲

	如两个人考试，一个人考100，一个人考90
	我们可以认为考试这个行为是根据对象的不同而有差异，那么建议讲考试这个方法定义为实例方法

*/

public class StaticTest05 {
	public static void main(String[] args) {
		User u = new User();
		u.setName("LBB");
		u.printName();
		System.out.println("用户的名字是：" + u.getName());
		//u.printName1(u); 这个也是可以的，但是没必要，因为name本身就在类里面，直接可以System.out.println(name)，不需要传递参数u
		
	}
}

class User {
	//实例变量，需要对象
	private int id;

	private String name;

	//打印用户的名字
	public void printName() {
		System.out.println(name);
	}

	public void setName(String x) {
		name = x;
	}

	public String getName() {
		return name;
	}

	/*public void printName1(User u) {
		System.out.println("新方法：" + u.name);
	}*/

	public void setId(int i) {
		id = i;
	}

	public int getId() { //这里不能定义成static的，因为static的可以通过类名来访问，但是id是实例变量，无法通过类名.的方式来访问
		return id;
	}
}