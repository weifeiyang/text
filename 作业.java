package text3;

import java.util.Scanner;

public class 作业{
    public static double score[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double average,highest,lowest;
       int choose=menu();
       while(choose!=5)
       {
    	   switch (choose) {
		case 1:
			input();
			break;
        case 2:
        	average=average();
        	System.out.println(average);
			break;
        case 3:
        	highest=highest();
        	System.out.println(highest);
	        break;
        case 4:
        	lowest=lowest();
        	System.out.println(lowest);
	        break;
        case 5:break;
	        default:
	        	System.out.println("输入错误！");
			break;
		}
       choose=menu();
	}
	}
	public static int menu(){
		int choose=0;
		System.out.println("menu");
		System.out.println("1.input");
		System.out.println("2.average");
		System.out.println("3.highest");
		System.out.println("4.lowest");
		System.out.println("5.exit");
		System.out.println("请输入1-5");
		Scanner scan=new Scanner(System.in);
		choose=scan.nextInt();
		return choose;
	}

	public static double input(){
		double score[];
		System.out.println("输入成绩");
		score=new double[5];
		for(int i=0;i<score.length;i++){
			Scanner scan=new Scanner(System.in);
			score[i]=scan.nextDouble();
		}
		return score[5];
		
	}

	public static double average(){
			double sum=0;
		double average;
		for(int i=0;i<score.length;i++){
			sum=sum+score[i];
		}
		average=sum/5;
		return average;
	}
	public static double highest(){
		double highest=0;
		for(int i=0;i<5;i++){
			highest=score[0];
			if(highest<=score[i])
				highest=score[i];
		}
		return highest;
	}
	public static double lowest(){
		double lowest=0;
		for(int i=0;i<5;i++){
			lowest=score[0];
			if(lowest>=score[i])
				lowest=score[i];
		}
		return lowest;
	}


	
}
