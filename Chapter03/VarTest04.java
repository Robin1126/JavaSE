/* 
	变量可以在一个域当中重新赋值，但是不能重新声明
*/

public class VarTest04 {
	public static void main (String[] args) {
		int nianLing = 20;
		System.out.println(nianLing);
		nianLing = 30;
		System.out.println(nianLing);

		//不可以，之前已声明过nianLing这个变量了 
		//int nianLing = 100; 
	}
}