package manuse;

import java.util.Scanner;

public class FibonacciDemo {
	public static void main(String args[]){
		int firstTerm=0;
		int secondTerm=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value for n ");
		int n=scan.nextInt();
		System.out.println(firstTerm+"\n"+secondTerm);
		for(int i=3;i<n;i++){
			System.out.println("i"+i);
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			i++;
			System.out.println(nextTerm);
			scan.close();
		}
		
	}
}
