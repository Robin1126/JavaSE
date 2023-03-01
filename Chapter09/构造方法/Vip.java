public class Vip
{
	//会员号
	long no;
	//会员姓名
	String name;
	//性别
	boolean sex;
	//生日
	String birth;

	//无参数构造法
	public Vip() {
		
	}

	//有参数构造法
	public Vip(long number, String mingZi) {
		no = number;
		name = mingZi;
		/*
			sex = false;
			birth = null; 这里你看不到但是存在
		*/
	}

	public Vip(long number, String mingZi, String date) {
		no = number;
		name = mingZi;
		birth = date;
	}

	public Vip(long number, String mingZi, String date, boolean gender) {
		no = number;
		name = mingZi;
		birth = date;
		sex = gender; 
	//以上三个都是构造方法的重载
	}
}