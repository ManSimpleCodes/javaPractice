package manuse;

public class FinalizeThread5 {
	@Override
	public void finalize(){
		System.out.println("finalize.."+Thread.currentThread().getName());
		int a=10/0;
		System.out.println("finalize ends");
	}
	public static void main(String args[]) throws InterruptedException{
		FinalizeThread5 f1=new FinalizeThread5();
		//f1.finalize();
		f1=null;
		
		System.gc();
		Thread.sleep(2000);
		System.out.println("====***=============");
	}
}
