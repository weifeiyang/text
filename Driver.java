package Bank;

import java.util.Scanner;

public class Driver {
	public static Customer customer = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subMenu();

	}

	public static checkingAccount ch = null;
	public static savingsAccount sa = null;

	public static int menu() {
		int choice = 0;
		System.out.println("欢迎使用银行系统");
		System.out.println("  1.开户");
		System.out.println("  2.存款");
		System.out.println("  3.取款");
		System.out.println("  4.消费");
		System.out.println("  5.还款");
		System.out.println("  6.银行结算");
		System.out.println("  7.查询余额");
		System.out.println("  8.退出");
		System.out.println("请输入操作：");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static int subMenu() {
		int choice = menu();
		while (choice != 8) {
			switch (choice) {
			case 1:
				creat();
				break;
			case 2:
				save();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				comsume();
				break;
			case 5:
				repay();
				break;
			case 6:
				settle();
				break;
			case 7:
				balance();
				break;
			default:
				System.out.println("您的输入有误，请重新输入");
				break;
			}
			choice = menu();
		}
		return choice;
	}

	public static void creat() {
		int choice;
		System.out.println("1.开储存卡");
		System.out.println("2.开信用卡");
		System.out.println("请选择：");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			creatSavingAccount();
			break;
		case 2:
			creatAdministrator();
			break;
		default:
			System.out.println("您的输入有误，请重新输入");
			creat();
			break;
		}

	}

	public static void creatSavingAccount() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入身份证号：");
		String ssn = scan.next();
		System.out.println("请输入姓名：");
		String name = scan.next();
		System.out.println("请输入卡号：");
		String accountNum = scan.next();
		double balance = 0;
		System.out.println("请输入存款年利率：");
		double interestRate = scan.nextDouble();
		sa = new savingsAccount(accountNum, balance, interestRate);
		Customer customer = new Customer(ssn, name, null, sa);

	}

	public static void creatAdministrator() {

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入身份证号：");
		String ssn = scan.next();
		System.out.println("请输入姓名：");
		String name = scan.next();
		System.out.println("请输入卡号：");
		String accountNum = scan.next();
		double balance = 0;
		System.out.println("请输入信用卡年费用：");
		double serviceCharge = scan.nextDouble();
		ch = new checkingAccount(accountNum, balance, serviceCharge);
		Customer customer = new Customer(ssn, name, ch, null);
	}

	public static void save()// 存款
	{
		System.out.println("请选择卡类型");
		System.out.println("1.存储卡");
		System.out.println("2.信用卡");
		int choice;
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			if (sa == null) {
				System.out.println("请先开户");
			} else {
				System.out.println("请输入存款金额");
				double balance;
				balance = scan.nextDouble();
				sa.setBalance(sa.getBalance() + balance);
				System.out.println("存款成功");
				System.out.println("余额："+sa.balance);
			}
			break;
		case 2:
			if (ch == null) {
				System.out.println("请先开户");

			} else {
				System.out.println("请输入存款金额");
				double balance;
				balance = scan.nextDouble();
				ch.setBalance(ch.balance + balance);
				System.out.println("存款成功");
				System.out.println("余额："+ch.balance);
				
			}
			break;
		default:
			System.out.println("您的输入有误，请重新选择！");
			save();
			break;
		}

	}

	public static void withdraw() // 取款
	{
		System.out.println("请选择卡类型");
		System.out.println("1.存储卡");
		System.out.println("2.信用卡");
		int choice;
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			if (sa == null) {
				System.out.println("请先开户！");
			} else {
				System.out.println("余额：" + sa.getBalance());
				System.out.println("请输入取款金额：");
				double a;
				a = scan.nextDouble();
				if (sa.balance < a) {
					System.out.println("您的余额不足！");
				} else {
					sa.setBalance(sa.getBalance() - a);
					System.out.println("取款成功！");
					System.out.println("余额："+sa.balance);
				}
			}
			break;
		case 2:
			if (ch == null) {
				System.out.println("请先开户！");
			} else {
				System.out.println("余额：" + ch.getBalance());
				System.out.println("请输入取款金额：");
				double b;
				b = scan.nextDouble();
				if (ch.balance < b) {
					System.out.println("您的余额不足！");
				} else {
					ch.setBalance(ch.getBalance() - b);
					System.out.println("取款成功！");
					System.out.println("余额："+ch.balance);
				}

			}
			break;
		default:
			System.out.println("请重新输入选择");
			withdraw();
			break;
		}

	}

	public static void comsume() // 消费
	{
		Scanner scan = new Scanner(System.in);
		
			System.out.println("您希望使用哪张卡支付？");
			System.out.println("1.存储卡");
			System.out.println("2.信用卡");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				if(sa!=null) {
				System.out.println("存储卡");
				System.out.println("请输入消费金额：");
				double a;
				a = scan.nextDouble();
				if (sa.balance < a) {
					System.out.println("您的余额不足！");
				} else {
					sa.setBalance(sa.getBalance() - a);
					System.out.println("支付成功！");
				}}
				else {
					System.out.println("您没有存储卡");
				}
				break;
			case 2:
				if(ch!=null) {
				System.out.println("信用卡");
				System.out.println("请输入消费金额：");
				double b;
				b = scan.nextDouble();
				if (ch.balance < b) {
					System.out.println("您的余额不足！");
				} else {
					ch.setBalance(ch.getBalance() - b);
					System.out.println("支付成功！");
				}}
				else {
					System.out.println("您没有信用卡");
				}
				break;
			default:
				System.out.println("请重新输入选择");
				comsume();
				break;
			}

		
		
	}

	public static void repay()// 还款
	{
		if (ch != null) {
			if (ch.balance > ch.getServiceCharge()) {
				ch.setBalance(ch.balance - ch.getServiceCharge());
				System.out.println("还款成功！");
			} else {
				System.out.println("余额不足，还款失败！");
			}
		} else {
			System.out.println("您没有信用卡！");
		}
	}

	public static void settle()// 银行结算
	{
		if (sa != null) {
			sa.payInterest();
			System.out.println(sa.balance);
			System.out.println("结算成功");
			System.out.println("余额："+sa.balance);
		} else {
			System.out.println("您没有储存卡！");
		}
	}

	public static void balance()// 查询余额
	{
		System.out.println("请选择卡类型");
		System.out.println("1.存储卡");
		System.out.println("2.信用卡");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			if (sa == null) {
				System.out.println("请先开户！");
			} else {
				System.out.println("余额：" + sa.balance + "元");
			}
			break;
		case 2:
			if (ch == null) {
				System.out.println("请先开户！");
			} else {
				System.out.println("余额：" + ch.balance + "元");
			}
			break;
		default:
			System.out.println("请重新输入选择！");
			balance();
			break;

		}

	}
}
