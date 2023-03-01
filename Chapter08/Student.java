/*
	观察学生的共同特征，只表述属性
	共同特征：
		学号：int类型
		年龄：int类型
		姓名：String类型
		性别：采用char 或者 boolean
		住址：String类型

		以上是分析，现在可以开始写代码了
		定义student类，编写成员变量作为属性

		变量有一个特点，必须先声明，再赋值，才能访问。
		成员变量可以不赋值也能用？？？
*/


public class Student { //编译可以产生Student.class
	//以下都是属性，也就是成员变量
	//之前我们写的main方法里面的都是局部变量
	int stuID;
	int age;
	String name;
	boolean sex;
	String address;

}