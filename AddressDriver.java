package text4;

import java.util.Scanner;

public class AddressDriver {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入国家：");
		String g=scan.next();
		System.out.println("输入省份：");
		String s=scan.next();
		System.out.println("输入城市：");
		String c=scan.next();
		System.out.println("输入街道：");
		String j=scan.next();
		System.out.println("输入邮编：");
		String y=scan.next();
		Address address=new Address(g,s,c,j,y);
		System.out.println(address.toString());


	}
	

}
class Address {
    private String G;
    private String S;
    private String C;
    private String J;
    private String Y;
	public Address(String g, String s, String c, String j, String y) {
		super();
		G = g;
		S = s;
		C = c;
		J = j;
		Y = y;
	}
	public String getG() {
		return G;
	}
	public void setG(String g) {
		G = g;
	}
	public String getS() {
		return S;
	}
	public void setS(String s) {
		S = s;
	}
	public String getC() {
		return C;
	}
	public void setC(String c) {
		C = c;
	}
	public String getJ() {
		return J;
	}
	public void setJ(String j) {
		J = j;
	}
	public String getY() {
		return Y;
	}
	public void setY(String y) {
		Y = y;
	}
	@Override
	public String toString() {
		return G+S+C+J+Y;
	}
    
    
    
}
