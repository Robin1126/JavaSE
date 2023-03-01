//猫：subclass

public class Cat extends Animal {
	//对move方法进行重写

	//move方法的重写
	public void move() {
		System.out.println("猫在走猫步！");
	}

	//猫除了move以外应该有自己的行为
	public void catchMouse() {
		System.out.println("猫正在抓老鼠！");
	}
	
}