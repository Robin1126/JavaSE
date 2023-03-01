//先不使用递归，编写程序求1-n的和

public class RecursionTest02 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个整数: ");
		int n = s.nextInt();

		System.out.println("1到" + n + "的和是" + sum(n));

		//或者直接等差数列
		System.out.println("1到" + n + "的和是" + ((1+n)*n/2));
	}

	public static int sum(int x) {
		int sum = 0;
		while(1 <= x) {
			sum += x;
			x--;
		}
		return sum;
	}
}