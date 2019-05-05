package manuse;

public class FinalizeThread3 {
	static int count=0;
	public void finalize(){
		System.out.println(++count+"finalize.."+Thread.currentThread().getName());
	}
	static void m2(){
		FinalizeThread1 f2=new FinalizeThread1();
		FinalizeThread1 f3=new FinalizeThread1();
	}
	public static void main(String arg[]) throws InterruptedException{
		FinalizeThread1 f1=new FinalizeThread1();
		new FinalizeThread1();
		FinalizeThread1 f2=new FinalizeThread1();
		f1=null;
		f2=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println("=================");
		
	}
}
