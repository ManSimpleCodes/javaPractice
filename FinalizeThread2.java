package manuse;

public class FinalizeThread2 {
	public void finalize(){
		System.out.println("finalize.."+Thread.currentThread().getName());
	}
	public static void main(String arg[]) throws InterruptedException{
		FinalizeThread1 f1=new FinalizeThread1();
		new FinalizeThread1();
		System.gc();
		Thread.sleep(2000);
		System.out.println("=============");
	}
}
