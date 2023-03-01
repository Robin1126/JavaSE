//经过测试，私有方法不能覆盖，静态的不谈覆盖
//父类
public class OverrideTest06 {
	
	private void doSome() {
		System.out.println("OverrideTest06's private doSome methode execute!");
	}
	
	//入口
	public static void main(String[] args) {
		OverrideTest06 ot = new T();
		ot.doSome();//OverrideTest06's private doSome methode execute!
		//调用的是这上面的，说明子类的没有重写成功
	}
}

//子类
class T extends OverrideTest06 {
	//尝试重写doSome()
	//权限不能更低，但可以更高
	public void doSome() {
		System.out.println("T's public doSome methode execute!");
	}
}