package text3;


import java.util.*;

public class textl {

	public static void main(String[] args) {
		int n;
		System.out.println("ÊäÈë²ãÊın£º");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int m=1;m<=i;m++) {
				System.out.print("* ");
				
			} 
			System.out.println("");

		}
		
		
		
		
        

	}

}
