package Bank;

public class Customer {
	private 
	String ssn;
	String name;
	checkingAccount ch;
	savingsAccount sa;
	public Customer() {
		super();
	}
	public Customer(String ssn, String name, checkingAccount ch, savingsAccount sa) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.ch = ch;
		this.sa = sa;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public savingsAccount getSa() {
		return sa;
	}
	public void setSa(savingsAccount sa) {
		this.sa = sa;
	}
	@Override
	public String toString() {
		return "Customer [ssn=" + ssn + ", name=" + name + ", ch=" + ch.toString() + ", sa=" + sa.toString() + "]";
	}


}
