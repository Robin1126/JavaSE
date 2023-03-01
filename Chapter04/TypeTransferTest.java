public class TypeTransferTest {
	public static void main(String[] args) {
		//byte b1 = 1000; 不可以，数据超出类型范围127
		byte b2 = 20;
		short s = 1000;
		int c = 1000;
		//long d = c; 不可以c是int类型，并不能识别c的大小
		int f = 10 / 3; 

		long g = 10; // 自动类型转换
		//int h = g / 3; 不行 结果是long类型
		long m = g / 3;
		//byte x = (byte)g / 3 3是int类型，运算完毕还是int
		short y = (short)(g/3); //可以 最后转换成了short
		short i = 10;
		byte j = 5;
		//short k = i + j;不行，因为混合运算最后是成为int
		int n = i + j;
		char cc = 'a';

		System.out.println("cc=="+cc);
		System.out.println((byte)cc); //a字符为97
		int o = cc+100;
		System.out.println(o);

	}
}