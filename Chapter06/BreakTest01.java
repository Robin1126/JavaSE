/*
	break 语句：
	1. break语句比较特殊，特殊在一个单词成为一个完整的Java语句
		continue也是一样，他俩都是一个单词成为一条语句
	2. break翻译为折断，弄断
	3. break;用在哪里呢
		第一个位置：switch语句当中，用在中止switch语句的执行
		第二个位置：break;语句用在循环语句当中，用来中止循环的执行
			用在for当中
			用在while当中
			用在do...while..当中

	4. 以下程序主要是以for循环为例学习break转向语句

	5. break的执行并不会让整个方法结束，主要是结束离他最近的循环
		要中止方法，就使用return

	6. 选择性地中止循环
		用a: b：这类给for循环命名
		然后break后面接上对应的字母 break a;就ok
	
*/

public class BreakTest01 {
	public static void main(String[] args) {
		for (int i = 0; i < 10 ; i++ ) //输出0-9
		{
			if (i==5)
			{
				break; //break会让离他最近的循环语句终止掉
			}
			System.out.println("i = " + i);
			
		}

		for (int k = 0; k < 2 ; k++ )
		{
			
			for (int i = 0; i < 10 ; i++ )
			{
				if (i == 5)
				{
					break; //这个break不能管到上面的k
				}
				System.out.println("i -- > " + i);
			}
		}
		//以下的内容开发很少用
		//如果想中止外层的for怎么办？
		//用a：b:来给for循环命名
		//这时候break后面加上字母选择性地中止
		System.out.println("-------分割线-------");
		a:for (int k = 0; k < 2 ; k++ )
		{
			b:for (int i = 0 ; i < 10 ; i++ )
			{
				if (i == 5)
				{
					break a;
				}
				System.out.println("i --> " + i);
			}
		}
		System.out.println("呵呵");

	}
}