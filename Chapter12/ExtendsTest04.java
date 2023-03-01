/*
	测试：子类继承父类以后，可以子类对象可以调用父类的方法吗？
		实际上这个不是父类的方法，其实就是它自己的方法，因为它已经继承过来了，属于自己的了
*/

public class ExtendsTest04 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.move();
		System.out.println(c.name);
	}


}

class Animal {
	String name = "枕巾";

	public void move() {
		System.out.println(name + "正在移动！");
	}
}

//cat继承Animal会把Animal中所有的继承过来，除了构造方法
class Cat extends Animal { //相当于复制了一遍代码

}