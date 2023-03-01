/*
	super不是引用，也不保存地址，super也不指向任何对象
	super只是代表当前对象内部的那一块父类型特征
	this和super不能使用在静态方法当中
*/
public class SuperTest06 {
	
	public void doSome() { //实例方法
		System.out.println(this);
		//System.out.println();//super使用必须带.
	}
	
	public static void main(String[] args) {
		SuperTest06 st = new SuperTest06();
		st.doSome();
	}
}