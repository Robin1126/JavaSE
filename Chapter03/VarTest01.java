/* 
	变量的第一个测试程序：Var是变量
	
	1. 程序当中的数据？
		开发软件是为了解决现实世界的问题，有很多问题都是以数据的形式进行描述的
		所以软件执行的过程中都是对数据的处理
		
		软件在处理数据的之前需要表示数据
		在Java中有这样的一个概念：字面量
		
		数据在Java中被称为字面量

		各种数据都是字面量，可以分为很多类型
		整数型，浮点型，布尔型true和false 字符型字面量 a，b，c
		字符串型 如中国，美国这种

		其中字符型和字符串型都是描述现实世界中的文字
		字符型用''单引号 字符串型用""双引号

	2. 什么是变量？
		

	*/

	public class VarTest01 {
		public static void main(String[] args) {
			System.out.println(100);
			System.out.println(3.14);
			System.out.println(true);
			System.out.println(false);
			System.out.println('a');
			System.out.println('中');
			System.out.println("abc");
			System.out.println("国");
			System.out.println("1"); //这个不是整数型，这个是字符串型
		
			// 10+20=30 是找一块空间存10，一块存20，cpu计算+，最后得出30然后找一块空间30
			//以下3个10都占有不同的空间
			//如果想重复的使用同一个空间的话，就要给他取一个名字，也就是变量

			System.out.println(10);
			System.out.println(10);
			System.out.println(10);

			int i = 10;
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			//以上访问的i都是同一个空间，内存空间就得到了复用
			//以下的i和上面的i没有任何关系，只是一个字符i和一个字符串i
			System.out.println('i');
			System.out.println("i");
		}
	
	
	}

