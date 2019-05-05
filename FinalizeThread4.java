package manuse;

public class FinalizeThread4 {
	FinalizeThread4 i;
	static int count=0;
	public void finalize(){
		System.out.println(++count+"finalize.."+Thread.currentThread().getName());
	}
	public static void main(String args[]) throws InterruptedException{
		FinalizeThread4 f1=new FinalizeThread4();
		FinalizeThread4 f2=new FinalizeThread4();
		FinalizeThread4 f3=new FinalizeThread4();
		f1.i=f2;
		f2.i=f3;
		f3.i=f1;
		f1=null;
		f2=null;
		f3=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println("=================");
	}

}
