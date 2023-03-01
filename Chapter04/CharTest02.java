/*
	关于Java中的转义字符
	Java语言中\这个符号具有转义的作用
		\t 表示tab


*/

public class CharTest02 {
	public static void main(String[] args) {
		//普通的字符
		char c1 = 't';
		System.out.println(c1);

		//这里没有编译出错，\并不作为一个字符串
		//经过测试\t算的还是一个字符，\t表示的是制表符tab
		char c2 = '\t';
		
		System.out.println("abcdefg");
		System.out.println("abcdtefg");
		System.out.println("abcd\tefg"); //这里有了一个缩进
		
		//System.out.println(); 这里是打印以后换行
		//System.out.print();	这里是打印以后不换行
		System.out.print("HelloWorld");
		System.out.println("123abcdefg");

		System.out.print("abc");
		char c3 = '\n';
		System.out.print(c3); // 这里的\n是一个换行符
		System.out.println("def");

		//假设现在想在控制台输出一个 \ 字符怎么做
		System.out.println('\''); //这是把单引号转成了字符

		System.out.println('\\'); //用一个2连斜杠\ 就可以代表一个普通的\字符了

		System.out.println("test");
		System.out.println("\"test\""); //想要在字符串中包含双引号
		//注意 用中文的双引号也可以，但是一般不这么做

		System.out.println("'"); //这个可以吗? 测试可以！！
		System.out.println("'这样也可以哦'");

		//反斜杠u表示后面的是一个字符的unicode编码,unicode是一个16进制编码，4位的16进制编码正好是2个字节
		char x = '\u4e2d';
		char y = '\u4e2e';
		System.out.println(x); //这里表示的是中文字符 中 
		System.out.println(y);
	}
}
/* 
	16进制就是满16进一位，10以上到15用ABCDE表示
*/