/*
	业务要求：
		1. 从键盘上接收一个人的年龄
		2. 年龄要求为0-150，其他为非法，并给出提示
		3. 根据人的年龄来动态判断这个人的生命阶段
			0-5 婴儿
			6-10 少儿
			11-18 少年
			19-35 青年
			36-55 中年
			56-150 老年
		4. 请使用If语句完成以上的业务逻辑
*/

public class IfTest02 {
	public static void main(String[] args) {
		//从键盘读取输入
		java.util.Scanner s = new java.util.Scanner(System.in); //创建对象
		System.out.print("请输入年龄:");
		int age = s.nextInt();//对象的方法给age赋值
		System.out.println("您输入的年龄是："+age); 
		/*
		if (age<0 || age>150)
		{
			System.out.println("对不起，年龄值不合法");
		} else { //先使用嵌套的方式
			if (age<=5)
			{
				System.out.println("婴儿");
			} else if (age<=10)
			{
				System.out.println("少儿");
			} else if (age<=18)
			{
				System.out.println("少年");
			} else if (age<=35)
			{
				System.out.println("青年");
			} else if (age<=55)
			{
				System.out.println("中年");
			} else if (age<=150)
			{
				System.out.println("老年"); //注意能到这里就是大于55的，就不需要条件里面写大于55
			}
		}
		*/
		/*if (age<0 || age>150) //不使用嵌套，直接使用else if
		{
			System.out.println("对不起，年龄值不合法");
		} else if (age<=5)
			{
				System.out.println("婴儿");
			} else if (age<=10)
			{
				System.out.println("少儿");
			} else if (age<=18)
			{
				System.out.println("少年");
			} else if (age<=35)
			{
				System.out.println("青年");
			} else if (age<=55)
			{
				System.out.println("中年");
			} else 
			{
				System.out.println("老年"); //注意能到这里就是大于55的，就不需要条件里面写大于55
			}*/
		String str = "老年";
		if (age<0 || age>150) //不使用嵌套，直接使用else if
		{
			System.out.println("对不起，年龄值不合法");
			return;//中止执行，不往下执行
		} else if (age<=5)
			{
				str = "婴幼儿";
			} else if (age<=10)
			{
				str="少儿";
			} else if (age<=18)
			{
				str="少年";
			} else if (age<=35)
			{
				str="青年";
			} else if (age<=55)
			{
				str="中年";
			} 
			System.out.println(str); //这样比较快，没那么繁琐反复输出system.out.println
			//对于初学者来说，没有考虑到条件的问题，这是正常的，需要时间的积累
			//这样就会一步一步变漂亮
			//最好的代码是最少的代码，执行效率最高

		}
}