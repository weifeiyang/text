package text;

import java.util.Scanner;

public class zuoye2 {
	public static void main(String arg[]) {
	
		float length;//����
		float width;//���
		String fram;//������
		String oridinary = "oridinary";
		String fancy = "fancy";
		String color;//��ɫ
		int numberOfCrowns;//�ʹ�����
		double cost;//�ɱ�
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�����볤�ȣ�");
		length=scan.nextFloat();
		
		System.out.println("�������ȣ�");
		width=scan.nextFloat();
		
		System.out.println("�����������ͣ�");
		fram=scan.next();
		
		System.out.println("��������ɫ��");
		color=scan.next();
		
		System.out.println("��������ûʹڸ�����");
		numberOfCrowns=scan.nextInt();
		
		
		if(fram.equals(oridinary)) {
			cost=(0.10+0.15)*2.00*(length+width)+(0.07+0.02)*(length+width)+0.35*numberOfCrowns;
	
		}
		else {
			cost=(0.10+0.25)*2.00*(length+width)+(0.07+0.02)*(length+width)+0.35*numberOfCrowns;
		}
		System.out.println("�ɱ��۸�Ϊ"+cost);
	}

}
