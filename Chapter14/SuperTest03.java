/*
	1.在恰当的时间使用：super{实际参数列表}；
	2.注意：在构造方法执行过程中一连串调用了父类的构造方法，但是实际上对象只创建了一个

	3.思考：super(实参)到底是干啥的？
		初始化当前对象的父类型特征，并不是创建新对象！！！实际上对象只创建了一个

	4.super关键字代表什么？
		关键字代表的就是当前对象的那部分父类特征
		比如我继承了父亲的一部分特征，比如眼镜，肤色等
		super代表的就是这一部分的总和，虽然是继承，但是也是我的一部分
*/

public class SuperTest03 {
	public static void main(String[] args) {
		CreditAccount ca1 = new CreditAccount(); //调用时候先把父类的特征初始化，Account包含Object类型特征，而CreditAccount类型特征又包含这两个，这样才构造完成了对象。
		//这里是一层包一层的，并没有创建多个对象，每一份的特征都有一个super指向里面的一层，父类的特征已经被子类继承使用了~
		System.out.println(ca1.getActno() + "," + ca1.getBalance() + "," + ca1.getCredit());
		CreditAccount ca2 = new CreditAccount("1111", 1000, 0.99);
		System.out.println(ca2.getActno() + "," + ca2.getBalance() + "," + ca2.getCredit());
	}

}

//账户
class Account {
	//属性
	private String actno;
	private double balance;

	//构造方法
	public Account() {  }

	public Account(String actno, double balance) {
		this.actno = actno;
		this.balance = balance;
	}

	//getter and setter
	public void setActno(String actno) {
		this.actno = actno;
	}

	public String getActno() {
		return this.actno;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}
}


//信用账户
class CreditAccount extends Account { //关键就是这一句话extends表示继承
	//属性
	private double credit;
	//构造方法
	public CreditAccount() {
		
	}

	public CreditAccount(String actno, double balance, double credit) {
		super(actno, balance);
		this.credit = credit;

	//私有的属性只能在本类中访问,但是可以调用父类的方法进行赋值
	}
	//setter and getter

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public double getCredit() {
		return this.credit;
	}
}