package manuse;

import java.util.Scanner;

public class EvenOddThread extends Thread {
	public void run(){
	
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter nth value ");
		int n=scan.nextInt();
		int eo[]=new int[n];
		System.out.println("enter values ");
		for(int i=0;i<eo.length;i++){
			eo[i]=scan.nextInt();
		}
		int even[]=new int[n];
		int odd[]=new int[n];
		
		
		for(int i=0;i<eo.length;i++){
			if(eo[i]%2==0){
				even[i]=eo[i];
			}else{
				odd[i]=eo[i];
			}
		}
		System.out.println("even numbers");
		System.out.println("=====================");
		for(int i=0;i<even.length;i++){
			if(even[i]!=0){
				System.out.println("even numbers "+even[i]);
				
			}
		}
		System.out.println("**********************");
		System.out.println("odd numbers");
		System.out.println("=====================");
		for(int i=0;i<odd.length;i++){
			if(odd[i]!=0){
				System.out.println("odd numbers "+odd[i]);
				
			}
		}					
	}
	public static void main(String args[]){
		EvenOddThread eot=new EvenOddThread();
		eot.start();
		
	}
}
