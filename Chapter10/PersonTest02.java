public class PersonTest02 {
	public static void main(String[] args) {
		
		
		Person p1 = new Person();

		//age彻底不能访问了，太安全了
		//age不能访问意义就不大了
		//读age属性
		//System.out.println(p1.age);

		//改age的值
		//p1.age = 20;
		//System.out.println(p1.age);

		System.out.println(p1.getAge());
		p1.setAge(10);
		System.out.println(p1.getAge());

		p1.setAge(-100);
		System.out.println(p1.getAge());
	}
}