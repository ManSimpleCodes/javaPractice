package manuse;

import java.util.Scanner;

class Customer{
	int amount=10000;//account balance
	///////////////withdraw method///////////////////////
	synchronized void withdrawal(int amt) throws InterruptedException{
		System.out.println("going to withdraw");
		if(this.amount<amt){//accountBalance < enteredWAmount
			System.out.println("less balance:waiting for deposit");
			wait();
			//wait(10000);
		}
		
			this.amount=this.amount-amt;//AccountBalance=AccountBalance-enteredWAmount
			System.out.println("after withdrawal.."+this.amount);
			System.out.println("withdrawal completed");	
			
	}
	//////////////////////deposit method/////////////////
	synchronized void deposit(int amt1){
		System.out.println("going to deposit.....");
		System.out.println("before deposit"+this.amount);
		this.amount=this.amount+amt1;//AccountBalance=AccountBalance+enteredDAmount
		System.out.println("deposit completed");
		System.out.println("after depost..."+this.amount);
		//notify();
		notifyAll();
	}
}
public class InterThreadCommunication {
	public static void main(String args[])throws InterruptedException{
		final Customer c=new Customer();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter withdrawal amount");
		int with=scan.nextInt();
		////////////////thread1================
		new Thread(){
			public void run(){
					try {
						c.withdrawal(with);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}	
			}
		}.start();
		Thread.sleep(4000);
		/////////////////thread 2//////
		System.out.println("enter deposit amount");
		int dep=scan.nextInt();
		new Thread(){
			public void run(){
					c.deposit(dep);	
			}
		}.start();
		
	}
}
