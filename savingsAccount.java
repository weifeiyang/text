package Bank;

public class savingsAccount extends bankAccount{
	private
	double interestRate;

	public savingsAccount() {
		super();
	}
	public savingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void payInterest() {
		super.setBalance(getBalance()*(1+interestRate));
	}
	public String toString() {
		return super.toString()+"rate:"+this.interestRate;
	}

	

}
