public class T
{
	public static void main(String[] args) {
		TT1.doSome(); //编译器这里也会把TT1给编译了
	}
}

class TT
{
	public static void doSome() {
		S.p("do something!!!");
	}
}

//class分开来写，不放在一个文件里面也没什么问题
//但是执行java的时候，必须这些类当中有一个main方法
//而且必须有一个是public class的类和文件名一致
