public class ExceptionHand2{
	public static void main(String arg[]){
		try{
			System.out.println("try block");
			//int a=10/0;
			//System.out.println("manu".chatAt(40));
			System.out.println(new int[] {12,3,4} [3]);
			//int b[]=new int[-1];
		}
		catch(ArithmeticException e){
			System.out.println("catch block ae..");
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("catch block string bounds..");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catch block array index bounds.");
		}
		catch(Exception e){
			System.out.println("catch block exception .");

		}
		finally{
			System.out.println("finally Block");
		}
	}
}
				
