public class IntTest07 {
	public static void main(String[] args) {
		

		long a = 10;
		char c = 'a';
		short s = 100;
		int i = 30;

		System.out.println(a+c+s+i);//这个没有问题

		int x = (int)(a + c + s + i);//不强制转换的话会报错，long到int精度损失
		System.out.println(x);

		//多种数据类型进行混合运算的时候，最终结果是对应的最大容量类型
		//如上面的例子long是最大的，运算结果就是long
		//但是byte+short+char除外，这个时候并不是以最大的short为基准，而是各自转换成为int类型再运算，结果也是int类型

		//Java中规定，int类型和int类型的最终结果还是int
		int temp = 10 / 3; //最后结果还是3，小数部分被舍去
		System.out.println(temp);

		int temp1 = 1 / 2;
		System.out.println(temp1); //最后结果是0，0.5的小数部分被去掉了

		//在Java中，计算结果不一定是精确的
	}
}