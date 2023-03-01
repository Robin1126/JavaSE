/*
	题目：
	1.系统接收一个学生的考试成绩，并且给出等级
	2.等级有优，良，中
	3. 优 90-100
		良 80-90
		中 70-80
		及格 60-70
		不及格 0-60
	4.成绩必须在0-100之间，可能带有小数
*/

public class IfTest03 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("请输入一个学生的成绩：");
		double point = s.nextDouble();
		//接收一个输入
		
		String str = "优";
		if (point<0.0 || point>100.0)
		{
			System.out.println("输入的成绩不合法");
			return;
		}else if (point<60.0)
		{
			str = "不及格";
		}else if (point<70.0)
		{
			str = "及格";
		}else if (point<80.0)
		{
			str = "中";
		}else if (point<90.0)
		{
			str = "良";
		}
		System.out.println(str);
	}
}