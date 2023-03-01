/*
	break和return语句有什么区别
	break用来中止switch分支或者离他最近的一个循环
	return直接中止整个方法
*/

public class MethodTest06
{
	public static void main(String[] args) {
		for (int i = 0; i < 10 ; i++ )
		{
			if (i == 5)
			{
				//break;
				return;//的时候直接整个方法结束了，而且不能return 10;这种不兼容类型
			}
			System.out.println("i == " + i);
		}
	System.out.println("Hello world!");
	}
}