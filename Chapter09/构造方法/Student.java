public class Student {
	//学号
	int no;
	//姓名
	String name;
	//年龄
	int age;

	public Student() {
		System.out.println("无参数的构造方法执行了");
	}

	public Student(int i) {
		no = i;
	}
}