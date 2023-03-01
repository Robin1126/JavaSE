public class LBBTest01 {
	static int year = 1992;

	public static void main(String[] args) {
	System.out.println(LBBTest01.year);
	
	LBBTest01 lbb = new LBBTest01();
	System.out.println(lbb.year); //year这个静态变量可以通过对象访问，也可以通过类来访问都没有问题
	}
}

class Student
{
	int id;

	boolean gender;
}