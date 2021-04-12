package Bank;

public class bankAccount {
	private
		String accountNum;
		double balance;
		public bankAccount() {
			
		}
		public bankAccount(String accountNum,double balance) {
			this.accountNum=accountNum;
			this.balance=balance;
		}
		public String getAccountNum() {
			return accountNum;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
	
}
