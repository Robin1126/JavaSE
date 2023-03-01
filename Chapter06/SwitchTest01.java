/*
	switch语句：
		1.switch语句也叫做分支语句，选择语句
		2.switch语句的语法格式
			switch（值）{
				case 值：
					java语句；
					break；
				case 值：
					java语句；
					break；
				default：
					java语句；
			
			}

			以上为完整的switch语句
				其中break；不是必须的，default也不是必须的
			
			switch支持什么？
				支持int类型和string类型
				如果遇到break，那么switch就结束了
				如果把byte short char传进来也会自动转换成为int类型
				所以本质上还是int类型
				如果break没有的话，则会发生case穿透现象
				也就是不再看case，而是把下面的java语句都执行了

				如果所有的case都没有匹配成功的话，最后的default就会执行
			3.switch语句的执行原理
*/

public class SwitchTest01
{
	public static void main(String[] args) {
		/*int x = 100;//switch只支持int，不能用long类型
		switch(x) {
			
		}*/

		/*
			写一个完整的switch语句
			接收键盘输入，根据数字来判断星期几
			0 星期日
			1 星期一。。。
		*/

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个数字，范围在0-6：");
		int day = s.nextInt();
		String str = "星期六";

		if (day<0 || day>6)
		{
			System.out.println("输入不合法！");
			return;
		}
		switch(day) {
			case 0:
				str = "星期天";
				break;
			case 1:
				str = "星期一";
				break;
			case 2:
				str = "星期二";
				break;
			case 3:
				str = "星期三";
				break;
			case 4:
				str = "星期四";
				break;
			case 5:
				str = "星期五";
				break;
			default:
				break;
		}
		System.out.println(str);
	} 
	//case 合并的问题
	//case 1: case 2: case 3:
}