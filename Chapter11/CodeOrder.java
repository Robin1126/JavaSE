//判断一下程序的执行顺序
public class CodeOrder {
	static {
		System.out.println("A");
	}
	public static void main(String[] args) {
		System.out.println("X");
		CodeOrder c = new CodeOrder();
		System.out.println("Y");
	}

	public CodeOrder() {
		System.out.println("B");
	}

	{
		System.out.println("C");
	}

	static {
		System.out.println("Z");
	}
}

//首先静态代码块先执行A Z 
//然后执行main方法的第一行X
//然后创建对象的时候 先执行实例代码块 C
//然后执行构造方法，输出B
//最后执行main方法中的输出Y
//A Z X C B Y
