/*
	1. id,name,age都有默认值
	
	2. id默认0 name默认null age默认0

	3. 思考：实例变量的默认赋值是什么时候赋值上去的？
		是在new创建的对象的时候赋值的，因为很显然直接User.id这样访问是不行的，因为类加载的时候并没有值
		实例变量是在构造方法执行的过程中完成初始化的，完成赋值的
*/

public class User
{
	//用户id
	int id;
	//用户名
	String name;
	//年龄
	int age; //如果在这里写了别的值，那么构造的时候就会赋值上去

	public User() {
		id = 111;
		name = "LBB";
		age = 30;
	}

	public User(int x) {
		
	} //这里实际有三行代码你看不见，给成员变量赋缺省值
}