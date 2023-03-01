import java.util.Scanner;

public class KeyInput2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//如果不用上面的import就要用
		//java.util.Scanner s = new java.util.Scanner(System.in);

		//做一个迷你计算器
		System.out.println("欢迎使用迷你计算器");
		System.out.print("请输入第一个数字：");
		int a = s.nextInt();//按下回车以后会自动换行
		//System.out.println();
		System.out.print("请输入第二个数字：");
		int b = s.nextInt();
		//System.out.println();
		System.out.println("他们的和是："+(a+b));
	}
}