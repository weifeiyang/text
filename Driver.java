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
		System.out.println("��ӭʹ������ϵͳ");
		System.out.println("  1.����");
		System.out.println("  2.���");
		System.out.println("  3.ȡ��");
		System.out.println("  4.����");
		System.out.println("  5.����");
		System.out.println("  6.���н���");
		System.out.println("  7.��ѯ���");
		System.out.println("  8.�˳�");
		System.out.println("�����������");
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
				System.out.println("����������������������");
				break;
			}
			choice = menu();
		}
		return choice;
	}

	public static void creat() {
		int choice;
		System.out.println("1.�����濨");
		System.out.println("2.�����ÿ�");
		System.out.println("��ѡ��");
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
			System.out.println("����������������������");
			creat();
			break;
		}

	}

	public static void creatSavingAccount() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������֤�ţ�");
		String ssn = scan.next();
		System.out.println("������������");
		String name = scan.next();
		System.out.println("�����뿨�ţ�");
		String accountNum = scan.next();
		double balance = 0;
		System.out.println("�������������ʣ�");
		double interestRate = scan.nextDouble();
		sa = new savingsAccount(accountNum, balance, interestRate);
		Customer customer = new Customer(ssn, name, null, sa);

	}

	public static void creatAdministrator() {

		Scanner scan = new Scanner(System.in);
		System.out.println("���������֤�ţ�");
		String ssn = scan.next();
		System.out.println("������������");
		String name = scan.next();
		System.out.println("�����뿨�ţ�");
		String accountNum = scan.next();
		double balance = 0;
		System.out.println("���������ÿ�����ã�");
		double serviceCharge = scan.nextDouble();
		ch = new checkingAccount(accountNum, balance, serviceCharge);
		Customer customer = new Customer(ssn, name, ch, null);
	}

	public static void save()// ���
	{
		System.out.println("��ѡ������");
		System.out.println("1.�洢��");
		System.out.println("2.���ÿ�");
		int choice;
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			if (sa == null) {
				System.out.println("���ȿ���");
			} else {
				System.out.println("����������");
				double balance;
				balance = scan.nextDouble();
				sa.setBalance(sa.getBalance() + balance);
				System.out.println("���ɹ�");
				System.out.println("��"+sa.balance);
			}
			break;
		case 2:
			if (ch == null) {
				System.out.println("���ȿ���");

			} else {
				System.out.println("����������");
				double balance;
				balance = scan.nextDouble();
				ch.setBalance(ch.balance + balance);
				System.out.println("���ɹ�");
				System.out.println("��"+ch.balance);
				
			}
			break;
		default:
			System.out.println("������������������ѡ��");
			save();
			break;
		}

	}

	public static void withdraw() // ȡ��
	{
		System.out.println("��ѡ������");
		System.out.println("1.�洢��");
		System.out.println("2.���ÿ�");
		int choice;
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			if (sa == null) {
				System.out.println("���ȿ�����");
			} else {
				System.out.println("��" + sa.getBalance());
				System.out.println("������ȡ���");
				double a;
				a = scan.nextDouble();
				if (sa.balance < a) {
					System.out.println("�������㣡");
				} else {
					sa.setBalance(sa.getBalance() - a);
					System.out.println("ȡ��ɹ���");
					System.out.println("��"+sa.balance);
				}
			}
			break;
		case 2:
			if (ch == null) {
				System.out.println("���ȿ�����");
			} else {
				System.out.println("��" + ch.getBalance());
				System.out.println("������ȡ���");
				double b;
				b = scan.nextDouble();
				if (ch.balance < b) {
					System.out.println("�������㣡");
				} else {
					ch.setBalance(ch.getBalance() - b);
					System.out.println("ȡ��ɹ���");
					System.out.println("��"+ch.balance);
				}

			}
			break;
		default:
			System.out.println("����������ѡ��");
			withdraw();
			break;
		}

	}

	public static void comsume() // ����
	{
		Scanner scan = new Scanner(System.in);
		
			System.out.println("��ϣ��ʹ�����ſ�֧����");
			System.out.println("1.�洢��");
			System.out.println("2.���ÿ�");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				if(sa!=null) {
				System.out.println("�洢��");
				System.out.println("���������ѽ�");
				double a;
				a = scan.nextDouble();
				if (sa.balance < a) {
					System.out.println("�������㣡");
				} else {
					sa.setBalance(sa.getBalance() - a);
					System.out.println("֧���ɹ���");
				}}
				else {
					System.out.println("��û�д洢��");
				}
				break;
			case 2:
				if(ch!=null) {
				System.out.println("���ÿ�");
				System.out.println("���������ѽ�");
				double b;
				b = scan.nextDouble();
				if (ch.balance < b) {
					System.out.println("�������㣡");
				} else {
					ch.setBalance(ch.getBalance() - b);
					System.out.println("֧���ɹ���");
				}}
				else {
					System.out.println("��û�����ÿ�");
				}
				break;
			default:
				System.out.println("����������ѡ��");
				comsume();
				break;
			}

		
		
	}

	public static void repay()// ����
	{
		if (ch != null) {
			if (ch.balance > ch.getServiceCharge()) {
				ch.setBalance(ch.balance - ch.getServiceCharge());
				System.out.println("����ɹ���");
			} else {
				System.out.println("���㣬����ʧ�ܣ�");
			}
		} else {
			System.out.println("��û�����ÿ���");
		}
	}

	public static void settle()// ���н���
	{
		if (sa != null) {
			sa.payInterest();
			System.out.println(sa.balance);
			System.out.println("����ɹ�");
			System.out.println("��"+sa.balance);
		} else {
			System.out.println("��û�д��濨��");
		}
	}

	public static void balance()// ��ѯ���
	{
		System.out.println("��ѡ������");
		System.out.println("1.�洢��");
		System.out.println("2.���ÿ�");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			if (sa == null) {
				System.out.println("���ȿ�����");
			} else {
				System.out.println("��" + sa.balance + "Ԫ");
			}
			break;
		case 2:
			if (ch == null) {
				System.out.println("���ȿ�����");
			} else {
				System.out.println("��" + ch.balance + "Ԫ");
			}
			break;
		default:
			System.out.println("����������ѡ��");
			balance();
			break;

		}

	}
}
