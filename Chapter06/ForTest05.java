/*
	1. 所有的合法语句都可以嵌套使用
	2. for循环嵌套一个for循环怎么理解？
		for(){
			for() {}
		}
		在分析外面的for的时候，把里面的语句当作普通的语句就可以了
		不要自己吓唬自己觉得复杂
*/

public class ForTest05 {
	public static void main(String[] args) {
		//for循环
		for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}

		for (int k = 0; k < 2 ; k++ )
		{
			System.out.println("k = "+k); //执行2次
		}

		for (int k = 0 ; k < 2 ; k++ ) //现在相当于里面的for执行了2次
		//每次进去里面的时候，i都要初始化1次
		{
			for(int i = 0; i < 10; i++) 
				{
					System.out.println("i = " + i);
				}
		}

		int i = 0;
		for (int k = 0; k < 2 ; k++ )
		{
			for (; i < 10 ; i++ )
			{
				System.out.println("i --> " + i); //只输出一次0-9 因为i不归零
			}
		}

		//分析要学会抽象，不要考虑那么多，只要一层层的考虑就行，里面的先把他当作普通的Java代码，不要搞特殊化
	}
}