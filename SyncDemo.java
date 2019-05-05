package manuse;
class Display{
	synchronized public void wish(String pName){
		for(int i=1;i<+25;i++){
			System.out.println("Good evening"+pName);
		}
		System.out.println("======");
	}
}
class MyThread1 extends Thread{
	Display d;
	String pName;
	@Override
	public void run(){
		d.wish(pName);
	}
	MyThread1(Display d,String pName){
		this.d=d;
		this.pName=pName;
	}
}


public class SyncDemo {
	public static void main(String arg[]){
		Display d=new Display();
		MyThread1 mt=new MyThread1(d,":manu");
		mt.start();
		MyThread1 mt1=new MyThread1(d,":pinky");
		mt1.start();
	}
}
