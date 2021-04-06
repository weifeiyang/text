package text5;

import java.util.Scanner;

public class DogDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    System.out.println("请输入名字：");
	    String name=scan.next();
	    System.out.println("请输入颜色：");
	    String color=scan.next();
	    System.out.println("请输入年龄：");
	    String ages=scan.next();
	    Dog dog=new Dog(name,color,ages);
	    System.out.println(dog.toString());

	}

}
