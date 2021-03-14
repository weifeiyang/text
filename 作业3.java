package text1;

import java.util.Scanner;

public class text {
	public static void main(String[] ages) {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入一个位数n:");
		int n=scan.nextInt();
		int shu=(int)(Math.pow(10, n-1));
   for( int i=1;i<shu;i++) 
   {
	 int shui=0;
	 int j=i;
	 while(j!=0) 
	{
			int weishu=j%10;
				shui+=(int)(Math.pow(weishu, 3));
				j=j/10;

			}
		if(shui==j) 
			System.out.println(i);
						
		}
	}

}
