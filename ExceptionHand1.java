 public class ExceptionHand1{
	public static void main(String ars[]){
		try{
			System.out.println("manin method starts");
			System.out.println("try block");
			System.out.println("db conection established");
			int a=10/0;
			System.out.println("db connection closed");
			System.out.println("main ends");
		}
		catch(Exception e){
			System.out.println("catch block");
			//e.printStackTrace();
			//System.exit(0);
			System.out.println("db connection closed");
			System.out.println("main ends");
		}
		finally{
			System.out.println("finally block");
			System.out.println("db connecion closed");
			System.out.println("main block ends");
		}
	}
}