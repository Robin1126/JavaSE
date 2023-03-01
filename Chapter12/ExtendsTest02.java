//使用继承机制解决复用问题

//银行账户类
//账户的属性：账号，余额
public class ExtendsTest02 {
	public static void main(String[] args) {
		Account act = new Account();
		act.setActno("111111");
		act.setBalance(10000);
		System.out.println(act.getActno() + ",余额" + act.getBalance());

		CreditAccount ca = new CreditAccount();
		ca.setActno("222222");
		ca.setBalance(20000);
		ca.setCredit(500);
		System.out.println(ca.getActno() + ",余额" + ca.getBalance() + ",信用额度" + ca.getCredit());
	}
}

//父类
class Account {
	//属性
	private String actno;
	private double balance;

	//构造方法
	public Account() {  }

	public Account(String  actno, double balance) {
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

//子类，子类中只要写父类中没有的方法和实例变量就可以了
//除了构造方法之外，剩下的东西都会继承过来
class CreditAccount extends Account { //关键就是这一句话extends表示继承
	//属性
	private double credit;
	//构造方法
	public CreditAccount() {
		
	}

	//setter and getter

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public double getCredit() {
		return this.credit;
	}
}
