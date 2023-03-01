/*
	在外部程序中访问Person中的数据

	不封装有什么缺点？
		Person类的age属性对外暴露，外部程序可以随意访问和修改
*/
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();

		//访问人的年龄
		//访问一个对象的属性，一种是读数据，一种是改数据

		//读数据
		System.out.println(p1.age); //get获取

		//修改 set
		p1.age = 30;
		System.out.println(p1.age);//再次get

		//因为可以随意访问，随意就可以随意赋值
		//在PersonTest这个外部程序中目前可以随意操作age属性
		p1.age = -100;
		System.out.println("您的年龄值是" + p1.age);//get
		//按理说年龄不是负数，但是程序目前还是给他通过了，这其实是程序的一个bug
		//这个就是随意访问的结果，属性是完全暴露的
	}
}
