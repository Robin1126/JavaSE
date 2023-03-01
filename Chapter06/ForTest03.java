/**/


public class ForTest03 {
	public static void main(String[] args) {
		//for的其他形式
		for (int i = 10;i > 0 ;i-- )
		{
			System.out.println("i = "+i); // 10到1
		}
		//变形
		for (int i = 0; i < 10 ; i += 2)
		{
			System.out.println("i = "+i); // 0 2 4 6 8
		}
		//变形
		for (int i = 100; i > 0 ; i %= 3 ) //对i求3的余数
		{
			System.out.println("i = "+i); //100 1 这会死循环了，1对3求余数还是1
		}
	}
}