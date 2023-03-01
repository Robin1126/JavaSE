// 编译的时候不能重复定义，也就是说一个int i不能再来一个double i
// 总而言之就是不能有同样名字的变量，跟变量的种类无关
public class VarTest05 {
	public static void main(String[] args) {
		//整数型
		int i = 100;

		System.out.println(i);
		
		double j = 3.14;
		// double i = 3.14; 会报错
		System.out.println(j);

	}
}