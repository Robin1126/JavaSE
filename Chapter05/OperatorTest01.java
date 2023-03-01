/*
	算数运算符：
	+	求和
	-	相减
	*  相乘
	/	商
	%	求模
	++ 自加
	-- 自减
	
	++运算符
	不管++是出现在前还是后，都会让变量自加1

*/

public class OperatorTest01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.println(a + b);//13
		System.out.println(a - b);//7
		System.out.println(a * b);//3
		System.out.println(a / b);//3
		System.out.println(a % b);//1

		// ++ 自加1，可以出现在变量前也可以出现在变量后
		
		int i = 10;
		i++;
		System.out.println(i);

		int k = 10;
		++k;
		System.out.println(k);

		//++出现在变量前和后有什么区别
		int m = 10;
		int n = m++; //可以确定的是m是11，m必定是自加1

		//语法：当++出现在变量后，会先做赋值运算，再自加1
		//当++出现在变量前面，先做自加运算再赋值

		System.out.println("n="+n); //10
		System.out.println("m="+m); //11

		int n1 = ++m;
		System.out.println("n1="+n1);

		//题目
		int c = 90;
		System.out.println("c="+(c++)); // 传，这里有一个隐形的赋值运算
		//上面的代码拆解 int temp = c++;
		//System.out.println(temp);
		System.out.println(c);
		//因此上面的结果是90，91

		int d = 80;
		System.out.println(++d);//81
		System.out.println(d);//80
		//同理，上面的结果是81 81 
		//同理 自减运算也是一样的 --c c--

		/*
			int  e = 1;
			int f = e; 将e赋值给f，传给了f
		*/
	}

}