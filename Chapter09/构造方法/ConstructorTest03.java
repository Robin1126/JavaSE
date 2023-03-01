public class ConstructorTest03 {
	public static void main(String[] args) {
		//调用不同的构造方法创造对象
		Vip v1 = new Vip();
		System.out.println(v1.no);
		System.out.println(v1.name);
		System.out.println(v1.birth);
		System.out.println(v1.sex);

		Vip v2 = new Vip(11111L, "LBB");
		System.out.println(v2.no);
		System.out.println(v2.name);
		System.out.println(v2.birth);
		System.out.println(v2.sex);

		Vip v3 = new Vip(22222L, "ZKY", "04.02.2023");
		System.out.println(v3.no);
		System.out.println(v3.name);
		System.out.println(v3.birth);
		System.out.println(v3.sex);

		Vip v4 = new Vip(33333L, "yier","04.02.2024",true);
		System.out.println(v4.no);
		System.out.println(v4.name);
		System.out.println(v4.birth);
		System.out.println(v4.sex);

	}
}