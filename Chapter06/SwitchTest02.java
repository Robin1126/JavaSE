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

	必须使用switch语句来实现
*/
public class SwitchTest02 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in); //注意小数点在这里使用,而不是.
		System.out.print("请输入成绩：");
		double grade = s.nextDouble();
		if (grade<0 || grade>100)
		{
			System.out.println("输入的成绩不合法！");
			return;
		}
		String str = "不及格"; //成绩score,等级是grade
		int rank = (int)(grade/10);
		switch(rank) {
			case 9: case 10:
				str = "优";
				break;
			case 8:
				str = "良";
				break;
			case 7:
				str = "中";
				break;
			case 6:
				str = "及格";
				break;
		}
		System.out.println(str);

	}
}