package Bank;

public class checkingAccount extends bankAccount{
	private
	double serviceCharge;

	public checkingAccount(String accountNum,double balance,double serviceCharge) {
		super(accountNum,balance);
		this.serviceCharge = serviceCharge;
	}

	public checkingAccount() {
		super();
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public void accessServieceCharge() {
		super.setBalance(getBalance()*serviceCharge);
	}
	public String toString() {
		return super.toString()+"serviCharge"+this.serviceCharge;
	}
}
