public class AnimalTest{
	
	//test方法是程序员b负责编写
	public void test(Animal a) {
		//别人调用这个方法的时候，可能给你test方法传过来一个Bird，也可能传过来一个Cat
		//对于我来说，我不知道你传过来是个啥
		//因为我看不到主方法
		//Cat c = (Cat)a;
		//c.catchMouse();
		if (a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.catchMouse();
		}else if (a instanceof Bird)
		{
			Bird b = (Bird)a;
			b.sing();
		}
	}
}