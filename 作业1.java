package text3;

import java.util.Scanner;

public class 作业1 {
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
			default:System.out.println("输入错误，请输入正确操作");
			}
			choose=menu();
		}

	}
	private static int menu() {
		int choose=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("*************************");
		System.out.println("1.输入两个数字（firstNum<secondNum）");
		System.out.println("2.输出两个数之间的奇数并求和");
		System.out.println("3.输出两个数之间的偶数并求和");
		System.out.println("4.输出1-10以及他们的平方");
		System.out.println("5.求第一个数与第二个数之间奇数的平方和");
		System.out.println("请输入操作");
		choose=scan.nextInt();
		return choose;
	}
	private static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个数");
		firstNum=scan.nextInt();
		System.out.println("请输入第二个数");
		secondNum=scan.nextInt();
		if(firstNum>secondNum) {
			System.out.println("请先输入正确数字！（firstNum<secondNum）");
			input();
		}
	}
	
	
	private static void sumOfOdd() {
		if(firstNum>secondNum) {
			System.out.println("请先输入两个数字！");
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
			System.out.println("请先输入两个数字！");
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
			System.out.println("请先输入两个数字！");
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

