//银行账户类
//账户的属性：账号，余额
public class ExtendsTest01 {
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

//这样子写代码有点臃肿了，其中前4个方法跟上面一样
class CreditAccount {
	private String actno;
	private double balance;
	private double credit;

	public CreditAccount() {
		
	}

	//setter and getter
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

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public double getCredit() {
		return this.credit;
	}
}
