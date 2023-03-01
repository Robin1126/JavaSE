/*
	
*/

//
public class MethodTest07 {
	public static void main(String[] args) {
		//调用方法
		int result = m1();
		System.out.println("结果是：" + result);

		result = m2(false);
		System.out.println("结果是：" + result);
	}

	public static int m() {
		boolean flag = true;
		if (flag)
		{
			return 1;
			//这里不能写，因为无论如何不会访问System.out.println("Hello world!");
		}else {
			return 0;
		} //因此如果是100%cover到就没事了
		//或者直接在最后面加一个 return 0;
		//因为if如果执行就结束了，如果没有就执行return 0;
	}
	
	public static int m1() {
		boolean flag = true;
		return flag ? 1 : 0;
	}

	public static int m2(boolean flag) {
		return flag ? 1 : 0;
	}
		
		
		//缺少返回语句，因为系统判定不一定会返回
		//只要上面不是void，那么大括号里面必须要100%的有return 值;才行
		//本质上就是编译器不负责运行程序，所以不知道flag是true，只知道是布尔类型
}
