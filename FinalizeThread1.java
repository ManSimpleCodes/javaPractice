package manuse;

public class FinalizeThread1 {
	static int count=0;
	public void finalize(){
		System.out.println(++count+"finalize.."+Thread.currentThread().getName());
	}
	static FinalizeThread1 m2(){
		FinalizeThread1 f2=new FinalizeThread1();
		FinalizeThread1 f3=new FinalizeThread1();
		return f3;
	}
	static FinalizeThread1 m3(){
		FinalizeThread1 f4=new FinalizeThread1();
		FinalizeThread1 f5=new FinalizeThread1();
		return f5;
	}
	public static void main(String arg[]) throws InterruptedException{
		FinalizeThread1 f1=new FinalizeThread1();
		FinalizeThread1 f6=m3();
		Runtime.getRuntime().gc();
		Thread.sleep(2000);
		System.out.println("=============");
	}
}
