/*
	方法覆盖比较经典的案例
	注意！！构造方法不继承，必须在子类中重新定义！
				还有就是父类中的private的属性，在子类中不能直接this.name访问，必须通过getName()方法进行访问
				建议将父类的方法复制粘贴，这样比较保险
*/

public class OverrideTest03 {
	public static void main(String[] args) {
		//创建2个对象，一个中国人，一个美国人
		Chinese c = new Chinese("罗彬彬");
		c.speak();

		American a = new American("Jane");
		a.speak();
	}
}

//人
class People {
	//属性
	private String name;
	//构造
	public People() {}
	public People(String name) {
		this.name = name;
	}

	//setter and getter
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void speak() {
		System.out.println(name + "正在说话");
	}
}

//中国人
class Chinese extends People {
	//中国人说的是汉语，所以要对superclass中的speak()进行重写
	public Chinese() {}

	public Chinese(String name) {
		setName(name);
	}
	//override
	public void speak() {
		System.out.println(getName() + "正在说汉语");
	}
}

//美国人
class American extends People {
	
	public American() {}

	public American(String name) {
		setName(name);
	}
	//override
	public void speak() {
		System.out.println(getName() + "正在说英语");
	}
}