package text3;

import java.util.Scanner;

public class ��ҵ1 {
	public static int firstNum=1,secondNum=0;
	public static void main(String[] args) {
		int choose=menu();
		while(choose!=6) {
			switch(choose) {
			case 1:input();break;
			case 2:sumOfOdd();break;
			case 3:sumOfEven();break;
			case 4:output1();break;
			case 5:output2();break;
			default:System.out.println("���������������ȷ����");
			}
			choose=menu();
		}

	}
	private static int menu() {
		int choose=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("*************************");
		System.out.println("1.�����������֣�firstNum<secondNum��");
		System.out.println("2.���������֮������������");
		System.out.println("3.���������֮���ż�������");
		System.out.println("4.���1-10�Լ����ǵ�ƽ��");
		System.out.println("5.���һ������ڶ�����֮��������ƽ����");
		System.out.println("���������");
		choose=scan.nextInt();
		return choose;
	}
	private static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������һ����");
		firstNum=scan.nextInt();
		System.out.println("������ڶ�����");
		secondNum=scan.nextInt();
		if(firstNum>secondNum) {
			System.out.println("����������ȷ���֣���firstNum<secondNum��");
			input();
		}
	}
	
	
	private static void sumOfOdd() {
		if(firstNum>secondNum) {
			System.out.println("���������������֣�");
			input();
		}
		int sumOfOdd=0;
		for(int i=firstNum;i<=secondNum;i++) {
			if(i%2!=0) {
				System.out.println(i);
				sumOfOdd=sumOfOdd+i;
			}
			
		}
		System.out.println("sumOfOdd:"+sumOfOdd);
	}
	private static void sumOfEven() {
		if(firstNum>secondNum) {
			System.out.println("���������������֣�");
			input();
		}
		int sumOfEven=0;
		for(int i=firstNum;i<=secondNum;i++) {
			if(i%2==0) {
				System.out.println(i);
				sumOfEven=sumOfEven+i;
			}
			
		}
		System.out.println("sumOfEven:"+sumOfEven);
	}
	private static void output1() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			System.out.println(i*i);
		}
		
	}
	
	private static void output2() {
		if(firstNum>secondNum) {
			System.out.println("���������������֣�");
			input();
		}
		int sum=0;
		for(int i=firstNum;i<=secondNum;i++) {
			if(i%2!=0) {
				System.out.println(i);
				sum=sum+i*i;
			}
		}
		System.out.println("sum:"+sum);
	}
}

