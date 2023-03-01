/*
	1. 什么是注释？是对源代码的解释说明，可以帮程序员更好的理解程序
	2. 注释只包含在源文件当中，字节码上面不会有注释信息
	3. 实际开发中，一般都要求积极的编写注释，这也是一个java软件工程师的必备素养
	4. 注释不是越多越好，精简到位最佳
*/

// 这种注释属于单行注释，只注释两个斜杠后面的内容

/**
* @version1.0
*	@author bjpower
* ...
* javadoc注释：可以被Javadoc.exe命令解析并且生成文档
*/

public class HelloWorld { //这是一个类，类名是HelloWorld

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("动力结点-口口相传的Java黄埔军校");
		System.out.println("我爱开元猪宝宝~");
		System.out.println("Ich liebe ZKY");
	}
}

/* 
	在这里可以编写多行注释
	这是第一行
	这是第二行
	这是第三行
*/


