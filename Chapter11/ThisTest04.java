/*
	1. this除了可以使用在实例方法中，还可以使用在构造方法中
	2. 新语法：通过当前的构造方法去调用另一个本类的构造方法，可以使用一下的语法格式
		this(实际参数列表);
		注意：构造方法1去调用构造方法2要求两个构造方法都在同一个类当中
	3. this（）这个就是代码复用，本类的构造方法调用本类的另一个构造方法
	
	4. this()的调用要是出现在构造方法里，只能出现一行并且是首行
	本质上就是构造方法之间的互相调用
*/

public class ThisTest04 {
	public static void main(String[] args) {
		Date date1 = new Date();
		date1.showDate();

		Date date2 = new Date(1992, 11, 26);
		date2.showDate();

		Date date3 = new Date(2008, 8, 8);
		date3.showDate();
	}
}

//以外写代码都要封装！
class Date {
	private int year;

	private int month;

	private int day;

	public Date() {
		/*
		year = 1970;
		month = 1;
		day = 1;
		*/
		this(1970, 1, 1); //一行就够了，this指代的是构造方法
		//Date(1970,1,1);这样不行
	}

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public void showDate() {
		System.out.println(year + "年" + month+ "月" + day + "日");
	}
}
/*
	需求：
		1. 定义一个日期类，可以表示年月日信息
		2.需求中要求：
			如果调用无参数构造方法，创建默认日期为1970年1月1日
			除了调用无参数构造方法，也可以调用有参数的构造方法创造日期对象。
*/