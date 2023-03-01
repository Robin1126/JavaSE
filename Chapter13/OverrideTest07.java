public class OverrideTest07 {
	public static void main(String[] args) {
		
	}
}

class Animal {
	public double sum(int a, int b) {return a+b;}
}

class Cat extends Animal {

	//方法重写
	public double sum(int a, int b) {return a+b;} //只能是一个double
}

class Myclass1
{
	public Animal getAnimal() { return null; }
}

class Myclass2 extends Myclass1
{
	public Cat getAnimal() { return null; }
}