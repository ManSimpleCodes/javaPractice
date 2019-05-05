package manuse;

public class Mythread implements Runnable {
	@Override
	public void run(){
		for(int i=0;i<10;i++)
			System.out.println("run"+Thread.currentThread().getName());
		m1();
	}
	public void m1(){
		for(int i=0;i<10;i++)
			System.out.println("m1()"+Thread.currentThread().getName());
		
	}
	public static void main(String sd[]){
		Mythread mt =new Mythread();
		//Thread t=new Thread();
		//t.start();
		Thread t=new Thread(mt);
		t.start();
		for(int i=0;i<10;i++)
			System.out.println("main();"+Thread.currentThread().getName());
		
		t.stop();
		
	}
	

}
