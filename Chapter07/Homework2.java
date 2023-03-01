
/*
	编写一个方法，输出大于某个正整数n的最小的质数
		比如：这个正整数n是2
		也就是要输出：大于2的最小的质数，结果就是3

		比如：这个正整数n是9
		也就是要输出：大于9的最小的质数，结果就是11

		大于11的最小的质数是：13
	
	思路：
		首先，系统一定会先给你一个“正整数n”，然后你基于
		这个n往后++，每加1得到的新数m判断一下是否为质数。
*/
public class Homework2{

	public static void main(String[] args){
	printZuiXiaoZhiShu(7);
	}

	// 这方法就是用来打印最小质数的。
	public static void printZuiXiaoZhiShu(int n) {
		while(!isZhiShu(++n)) {}
		//每次执行完循环体以后，要再次进行条件判断，此时的n又+1了
		System.out.println(n);
	}
	//如果n不是质数，应该让n继续往下加1直到找到n为止

	
	public static boolean isZhiShu(int num){

		for(int i = 2; i < num; i++){ 
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}

}
