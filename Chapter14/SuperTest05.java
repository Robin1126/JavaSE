public class SuperTest05 {
	public static void main(String[] args) {
		VIP zky = new VIP("ZKY");
		zky.shopping();
		
	}
}

class Customer {
	String name;

	public Customer() {}

	public Customer(String name) {
		this.name = name;
	}

}

class VIP extends Customer {
	//假设子类也有一个同名属性
	String name;
	
	
	public VIP() {}

	public VIP(String name) {
		super(name);
		//this.name = null;隐藏代码
	}
	
	
	public void shopping() {
		System.out.println(this.name + "正在购物！");//这里的this指向最外层的name
		System.out.println(super.name + "正在购物！");
		System.out.println(name + "正在购物！");
		/*
			null正在购物！
			ZKY正在购物！
			null正在购物！
		*/

		//如果父类和子类当中有同名属性，这时候的super.不能省略
		//java中是允许有同名属性的，一个属于父类，一个属于子类 一个在super指向的里层父类层，一个在子类最外层
	}
}