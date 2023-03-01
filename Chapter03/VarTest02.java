/**
* 变量测试类2
* @author 罗彬彬
* @version 1.5
* @since 1.0
*/
/*
	什么是变量？
	变量就是内存当中存储数据的最基本功能
	在java语言当中，任何数据都是有数据类型的，其中整数型是int=integer

	还有其他的类型，带小数的如 double，float

	数据类型有什么用？
	Java根据数据类型的不同，分配不同的空间
	对于int这样的整数类型，JVM会自动分配4个字节的大小的空间

	1个字节是8个比特位
	1个bit位就是1个1或者1个0 注意：bit位是2进制的
	所以一个int就是32个2进制位

	对于一个变量来说 三要素就是
	变量的类型
	变量的名字
	变量的值

	其中 类型决定分配空间的大小，名字是为了方便访问，值是变量保存的数据

	变量名也是遵循规范，也就是首字母小写，每个单词大写，遵循驼峰命名法

	int i = 2;
	00000000 0000000 00000000 00000010 在内存中的存储形式

	变量怎么声明？
	数据类型 变量名; 如 int i;

	变量可以声明的时候一起赋值，也可以后面加语句进行赋值

*/
public class VarTest02 {
	/**
	* 这是一个程序的入口
	* @param args是main方法的参数
	*/
	public static void main(String[] args) {
		int age = 45; //定义一个变量名字为age，并且存储数据45
		//在Java中规定，一个变量必须先声明后，再赋值才能够访问
		//在Java中，使用 = 赋值运算，等号的右边先执行，然后赋值给左边的变量
		System.out.println(age);
	}
}