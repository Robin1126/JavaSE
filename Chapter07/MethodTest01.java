/*
	对于一个Java程序来说，如果没有方法会出现什么问题
*/

public class MethodTest01 {
	public static void main(String[] args) {
		//方法入口
		//需求：请编写程序，计算100和200求和
		int a = 100;
		int b = 200;
		int sum = a + b;
		System.out.println(a + "+" + b + "=" + sum);

		//需求2：计算666和888的和
		//需求1和2是完全相同的，只不过数据不同
		int x = 666;
		int y = 888;
		int z = 666 + 888;
		System.out.println(x + "+" + y + "=" + z);

		//需求3：求111和222的和
		int x1 = 111;
		int y1 = 222;
		int z1 = 111 + 222;
		System.out.println(x1 + "+" + y1 + "=" + z1);

		/*
			以上代码写了两边，只不过参与运算的数值不同，显然代码没有得到重复利用，专业术语叫做复用性差。

			功能/业务逻辑既然相同，为什么要重复编写代码，写一份直接调用就可以

			如果想达到代码复用，需要学习Java中的方法机制
		*/
	}


}