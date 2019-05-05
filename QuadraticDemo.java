package manuse;

import java.util.Scanner;

public class QuadraticDemo {
	public static void main(String dsd[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a ");
		int a=scan.nextInt();
		System.out.println("enter b ");
		int b=scan.nextInt();
		System.out.println("enter c ");
		int c=scan.nextInt();
		double root1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
		double root2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
		System.out.println("root1"+root1);
		System.out.println("root2"+root2);
		scan.close();
	}
}
