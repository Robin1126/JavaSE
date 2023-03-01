/*
	关于Object类中的toString方法
	1. toString()方法的作用是什么？
		作用：将java对象转换成字符串的形式
	
	2. Object类中toString()的默认实现是什么？
		含义：调用一个java对象的toString()方法就可以将该java对象转换成字符串的实现

	为了让程序有很强的覆盖性，我们需要多态，所以我们在这里覆盖了toString()方法
*/

public class OverrideTest04 {
	public static void main(String[] args) {
		MyDate t1 = new MyDate(1970,7,1);
		//调用toString()方法
		System.out.println(t1.toString()); //输出的是t1的类名@地址的16进制哈希地址
		//你对这个输出结果满意吗？什么时候使用方法覆盖
		//需求不满足了，就要考虑覆盖了
		//object中的toString不满足需求了
		//现在希望转换成xx年xx月xx日
		//当直接输出引用的时候，System.out.println()会调用toString()方法，所以上面的System.out.println(t1.toString());
		//也可以写成
		System.out.println(t1);

		MyDate t2 = new MyDate(2008, 8, 8);
		System.out.println(t2);

		Student s = new Student(54684, "lbb");
		System.out.println(s);

		//重写toString方法之后可以表达出更需要的信息
	}

}

class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate() {}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return this.month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getDay() {
		return this.day;
	}

	public String toString() {
		return year + "年" + month  + "月" + day + "日";
	}
}

class Student {
	int no;
	String name;

	public Student() {}

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public String toString() {
		return "学号：" + no + "，名字：" + name;
	}
}