/*
	continue 语句
	 1. continue翻译为：继续
	 2. continue语句和break语句要对比学习
	 3. continue语句的作用是：
	 	中止当前循环，直接进入下一次循环继续执行
		for() {
			if() { continue;} 
			//以上continue一旦执行，下面的代码都不执行
			code 1;
			code 2;
			code 3;...
		}
		4. continue语句后面可以指定循环吗？
			可以 也是用命名的方式
			continue a:
*/
public class ContinueTest01 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if (i == 5)
			{
				break;
			}
			System.out.println("i --> " + i);
		}
/*
	i --> 0
	i --> 1
	i --> 2
	i --> 3
	i --> 4
	i --> 6
	i --> 7
	i --> 8
	i --> 9
*/
		for (int i = 0; i < 10 ; i++ )
		{
			if (i == 5)
			{
				continue; //continue的作用是当前循环就执行到这里，直接跳到更新表达式的执行，然后进入下一次的循环
			}
			System.out.println("i --> " + i); //把5给跳过了
		}

		System.out.println("----------------");
		a:for (int i = 0 ; i < 3 ; i++ )
		{
			b: for (int k = 0; k < 3 ; k++ )
			{
				if (k == 2)
				{
					continue a;
				}
					System.out.println("k --> " + k);
			}
						
		}
	}
}