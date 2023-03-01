//java中规定：参数传递的时候，和类型无光，统一都是将盒子中保存的那个东东复制一份，传递下去
//不管是基本数据类型还是引用数据类型


public class Test1 {
	public static void main(String[] args) { //i是局部变量，域是main
		int i = 10;
		add(i);
		System.out.println("main --->" + i);
	}

	public static void add(int i) { //i是局部变量，域是add
		i++;
		System.out.println("add --->" + i);
	}
}