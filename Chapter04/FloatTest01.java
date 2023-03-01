/* 
	关于Java语言中的浮点型数据 
	浮点型包括
		float			4个字节
		double		8个字节

		float 单精度
		double 双精度

		比如 10.0/3 采用float存储，可能是3.3333
		10.0/3 采用double存储，可能就是3.3333333333

		但是如果是在银行财务等方面，double是不够的，在Java中提供了一种精度更高的类型，
		java.math.BigDecimal 属于引用数据类型，不属于基本数据类型

		float和double存储数据的时候都是存储的近似值
		为什么？
		因为现实中有很多无限循环的小数，计算机内存有限，只能存储近似值

		只要记住double 8个字节，float 4个字节，double比float精度大

		注意：任意一个浮点型都比整数型空间大
		float容量>long容量

		Java中规定，任何一个浮点型数据默认被当作double来处理，如果想让这个小数当作
		浮点型来处理，那么请在字面量后面添加F/f
		
		比如 1.0当作double类型
		1.0f才是float类型
*/

public class FloatTest01 {
	public static void main(String[] args){
		double pi = 3.1415926;
		System.out.println(pi);

		//float f = 3.14;
		//System.out.println(f); 
		//错误，不兼容的类型，因为默认是double类型
		// 修改
		//第一种方式

		float f = 3.14f;

		//第二种方式就是强制类型转换，可能损失精度，谨慎使用
		float f1 = (float)3.14;
		System.out.println(f);
		System.out.println(f1);

		int i = (int)10.0 / 5; // 精度损失，先将5转换成为double，大容量无法转换成小容量
		//可以考虑将10.0转换成为int类型再运算
		System.out.println(i);

		int x = (int)(10.0/5); //也可以最后将结果进行转换
		System.out.println(x);
	}
}

