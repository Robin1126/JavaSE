/*
	1. 构造方法对应的英语单词：constructor
	2. 构造方法是用来创建对象并且给成员变量赋值
	3. 建议将无参数构造方法手动写出来，这样不会出错
*/

public class ConstructorTest02 {
	public static void main(String[] args) {
		User u = new User();//如果在User类中定义了别的方法，如果不手动添加缺省构造器，这里就会报错
		User u1 = new User(10); 

		System.out.println(u.age);
		System.out.println(u1.age); //User(int)里面是空白的，用缺省值
	}
}