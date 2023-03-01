/*
	学生类：
		学号
		姓名
		住址
		性别
		年龄

		注意：对于成员变量来说，没有手动赋值的时候，系统默认赋值。赋的值都是默认值，那么默认值是什么？
		数据类型		缺省默认值 
		byte			0
		short			0
		int			0
		long			0L
		float			0.0F
		double		0.0
		boolean		false
		char			\u0000
		引用数据类型 null

		null是一个关键字，全部小写表示空

		分析：对于成员变量来说，是不是应该一个对象有一份
		李四和张三的学号不一样，他们应该有两块不同的内存空间。
*/

public class Student {
	//定义成员变量
	
	int stuID; // 这种成员变量又被称为实例变量，也称为对象级别的变量
	String name;
	boolean gender;
	int age;
	String address;
}