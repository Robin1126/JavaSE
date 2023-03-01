/*
	题目：
		使用for循环，实现1-100所有基数求和
*/

public class ForTest04
{
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1 ; i < 100 ; i += 2 ) //这种效率比较高，因为循环的次数比较少
		{
			sum += i;
		}
		System.out.println("1-100的所有奇数和是："+sum);

		//另一种写法，for循环里面嵌套条件语句
		sum = 0;
		for (int i = 1; i <= 100 ; i++ )
		{
			if (i % 2 == 1)
			{
				sum += i;
			}
		}
		System.out.println("1-100的所有奇数和是："+sum);
	}
}