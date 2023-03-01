public class Test03
{
	public static void main(String[] args) {
		//main方法是程序员a编写
		AnimalTest at = new AnimalTest();
		
		at.test(new Cat());
		at.test(new Bird());//鸟出问题了~class cast exception
	}
}

