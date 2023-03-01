/*
	在外部程序中访问Person中的数据
*/
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();

		//访问人的年龄
		//访问一个对象的属性，一种是读数据，一种是改数据

		//读数据
		System.out.println(p1.age); //get获取
	}
}
