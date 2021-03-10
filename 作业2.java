package text;

import java.util.Scanner;

public class zuoye2 {
	public static void main(String arg[]) {
	
		float length;//长度
		float width;//宽度
		String fram;//相框类别
		String oridinary = "oridinary";
		String fancy = "fancy";
		String color;//颜色
		int numberOfCrowns;//皇冠数量
		double cost;//成本
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("请输入长度：");
		length=scan.nextFloat();
		
		System.out.println("请输入宽度：");
		width=scan.nextFloat();
		
		System.out.println("请输入框架类型：");
		fram=scan.next();
		
		System.out.println("请输入颜色：");
		color=scan.next();
		
		System.out.println("请输入放置皇冠个数：");
		numberOfCrowns=scan.nextInt();
		
		
		if(fram.equals(oridinary)) {
			cost=(0.10+0.15)*2.00*(length+width)+(0.07+0.02)*(length+width)+0.35*numberOfCrowns;
	
		}
		else {
			cost=(0.10+0.25)*2.00*(length+width)+(0.07+0.02)*(length+width)+0.35*numberOfCrowns;
		}
		System.out.println("成本价格为"+cost);
	}

}
