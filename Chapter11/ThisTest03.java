/*
	1. this可以使用在实例方法当中，不能使用在静态方法中
	2. this关键字大部分情况下可以省略，什么时候不能省略呢？
		在构造方法和实例方法当中，为了区分局部变量和实例变量，这个时候是不能省略的
*/

public class ThisTest03 {
		public static void main(String[] args) {
			Student lbb = new Student();
			lbb.setName("LBB");
			lbb.setNo(54684);

			System.out.println("学号：" + lbb.getNo());
			System.out.println("姓名: " + lbb.getName());
			System.out.println();

			Student zky = new Student(11111, "ZKY");
			System.out.println("学号：" + zky.getNo());
			System.out.println("姓名: " + zky.getName());
		}
}

// 学生类
//为了增加可读性，可以把方法中的参数改成 this.no = no
class Student {
	private int no;

	private String name;
	
	//构造方法 无参
	public Student() {  }
	//构造方法 有参
	public Student(int no, String name) { //就近原则，no变成了传入的参数，而不是实例变量
		this.no = no;
		this.name = name; //前面的name是对象的name接受传入的name
		//this的作用是区分变量和实例变量
	}
	//set and get
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getNo() {
		return no;
	}

}