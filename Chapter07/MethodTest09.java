public class MethodTest09 {
	public static void main(String[] args) {
		int result = MethodTest09.sum(10, 20);
		System.out.println(result);
	//上面两行代码能否合并为一行
		System.out.println(sum(100, 200));
		System.out.println(m());

		boolean flag = m();
		if (flag)
		{
			System.out.println("真的");
		}
		//合并上面的代码
		if (m())
		{
			System.out.println("真的");
		}
		//节省了新建变量，而是直接把方法的结果放到需要用的地方 
	}

	//返回布尔类型
	public static boolean m() {
		return true;
	}

	//求和的方法
	public static int sum(int x, int y) {
		return x + y;
	}
}