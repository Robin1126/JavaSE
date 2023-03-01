/*
	要求：使用for循环实现99乘法表
*/
//要分析问题，思考怎么表达出来
//一般情况下用不了那么多的嵌套
public class ForTest06 {
	public static void main(String[] args) {
		int result;
		for (int i = 1; i <= 9 ; i++)
		{
			for (int j =1; j <= i ;j++ )
			{
				result = i*j;
				System.out.print(j+" x "+i+" = "+result+"	");
			}
			System.out.println();
		}
	}

}