/*
	题目：
	业务：
		从键盘上接收天气的信息
		1表示雨天
		0表示晴天

		同时从键盘上接收性别信息
		1表示男
		0表示女

		业务要求
		当天气雨天
			男：打一把大黑伞
			女：打一把小花伞
		当天气晴天
			男：直接走起，出去玩耍
			女：擦点防晒霜，出去玩耍

		使用if语句实现
*/

public class IfTest04 {
	public static void main(String[] args) {
	java.util.Scanner s = new java.util.Scanner(System.in);
	System.out.print("请输入天气信息，1表示晴天，0表示雨天：");
	int weather = s.nextInt();
	System.out.print("请输入性别信息，1表示男，0表示女：");
	int sex = s.nextInt();

	if (weather == 1)
	{
		if (sex == 1)
		{
			System.out.println("打一把大黑伞");
		}else {
			System.out.println("打一把小花伞");
		}
	}else {
		if (sex == 1)
		{
			System.out.println("直接走起，出去玩耍");
		}else {
			System.out.println("擦点防晒霜，出去玩耍");
		}
	}
}
}