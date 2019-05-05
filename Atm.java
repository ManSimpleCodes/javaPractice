import java.util.Scanner;
class Atm{
	Scanner input=new Scanner(System.in);
	int pin;
	static String expDate;
	{
		System.out.println("nsb2");
		System.out.println("enter pin number");
		pin=input.nextInt();
	}
	public static void main(String args[]){
		System.out.println("main method");
		Atm obj=new Atm();
		System.out.println("pin....."+obj.pin);
		System.out.println("expiry date...."+expDate);
	}
	
	{
		System.out.println("nsb1");
		System.out.println("enter your card expiry date");
		expDate=input.next();
	}
}