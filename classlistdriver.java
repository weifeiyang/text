package text6;

import java.util.Scanner;

public class classlistdriver {
	private static classlist list=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose=menu();
		while(choose!=3) {
			switch(choose) {
			case 1:createlist();break;
			case 2:printlist();break;
			case 3:break;
			default:System.out.println("��Ч��ѡ��");
			}
			choose=menu();
			
		}
        
	}
	public static int menu() {
		int choose=0;
		System.out.println("======WTU�γ̹���ϵͳ======");
		System.out.println("1.Create List");
		System.out.println("2.Print List");
		System.out.println("3.Exit");
		Scanner scan=new Scanner(System.in);
		choose=scan.nextInt();
		return choose;
	}
	public static void createlist() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�������꣬ѧ��");
		System.out.println("ѧ��1ѧ�ţ�����");
		System.out.println("ѧ��2ѧ�ţ�����");
		System.out.println("������γ̺ţ��γ���");
		String year=scan.next();
		String semester=scan.next();
		String st1Name=scan.next();
		String st1ID=scan.next();
		String st2Name=scan.next();
		String st2ID=scan.next();
		String ID=scan.next();
		String Name=scan.next();
		Student s1=new Student(st1ID,st1Name);
		Student s2=new Student(st2ID,st2Name);
	    Subject subj=new Subject(ID,Name);
	    list=new classlist(semester,year,subj,s1,s2);
	   
	}
	public static void printlist() {
		if(list==null) {
		   System.out.println("������ɵ�һ��");
		   return;
		}
		System.out.println(list.toString());
	}

}
