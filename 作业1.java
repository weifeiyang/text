package text;

import java.util.Scanner;

public class zuoye1 {
	public static void main(String arg[]) {
		//�������
		double dollar;
		double coin50;
		double coin20;
		double coin10;
		double coin5;
		int theWholeMoney;
		double change;
		int a,b,c,d;
		//������ֵ
		coin50=50d;
		coin20=20d;
		coin10=10d;
		coin5=5d;
		Scanner scan = new Scanner(System.in);
		System.out.println("�����룺");
		dollar=scan.nextDouble();
		a=0;b=0;c=0;d=0;
		//���㴦��
		theWholeMoney=(int)dollar;
		change=dollar%1;
		while(change>0) {
		if(change*100-50>=0) {
			change=change-0.5;a=a+1;
		}
		else if(change*100-20>=0) {
			change=change-0.2;b=b+1;
		}
		else if(change*100-10>=0) {
			change=change-0.1;c=c+1;
		}
		else if(change*100-5>=0) {
			change=change-0.05;d=d+1;
		}
		else {
			change=0;
		}
		}
		//������
	System.out.println(theWholeMoney+"��Ԫ+"+a+"*50c+"+b+"*20c+"+c+"*10c+"+d+"*5c" );
	}
	}
