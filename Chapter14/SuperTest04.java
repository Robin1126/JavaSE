public class SuperTest04 {
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
	public VIP() {}

	public VIP(String name) {
		super(name);

	}
	
	
	public void shopping() {
		System.out.println(this.name + "正在购物！");//name在this指向的对象空间中，没问题，可以访问 this只是不能用来
		System.out.println(super.name + "正在购物！");//name如果是父类继承过来的私有变量，不能直接用this来使用
		
	}
}