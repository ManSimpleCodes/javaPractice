import java.util.Scanner;
class InvAgeExp extends Exception{
		public InvAgeExp(String message){
			super(message);
		}
public InvAgeExp(){
			
		}	
		
		public void checkAge(int age){
		try{
		if(age>=18){
			System.out.println("this person is not eligible for voting");
		}
		else
		throw new InvAgeExp("invalid age..");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
public class ExceptionHand3{
		public static void main(String args){
				 InvAgeExp ie =new InvAgeExp();
				Scanner scan=new Scanner(System.in);
				System.out.println("enter your age");
				int age=scan.nextInt();
				ie.checkAge(age);
		}
	}
