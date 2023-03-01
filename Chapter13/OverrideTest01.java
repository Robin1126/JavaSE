/*
	
	当前程序存在的问题（设计上的问题）
	 鸟儿在执行move方法的时候，最好的输出结果是鸟儿在飞翔，
	 很显然从Animal继承过来的方法已经无法很好的满足业务需求
*/
public class OverrideTest01 {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.move();
	}
}


//superclass
class Animal {
	public void move() {
		System.out.println("动物在移动！");
	}
}

class Bird extends Animal {
	//子类继承父类之后，有一些行为可能不需要改进，有一些行为可能需要改进
	//因为父类中继承过来的方法已经无法满足需求
}

class Cat extends Animal {
	//希望猫在move方法中输出的是 猫在走猫步
}

//这种改进的方法就叫方法的覆盖