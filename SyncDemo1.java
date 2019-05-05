package manuse;
////////class level locking////////////////
class Display1{
	 public void wish(String pName){
		 synchronized(Display1.class){
		for(int i=1;i<+25;i++){
			System.out.println("Good evening"+pName);
		}
		System.out.println("======");
	}
	 }
}

class MyThread2 extends Thread{
	Display1 d;
	String pName;
	@Override
	public void run(){
		d.wish(pName);
	}
	MyThread2(Display1 d,String pName){
		this.d=d;
		this.pName=pName;
	}
}
public class SyncDemo1 {
	public static void main(String arg[]){
		Display1 d1=new Display1();
		MyThread2 mt=new MyThread2(d1,":1manu");
		mt.start();
		Display1 d2=new Display1();
		MyThread2 mt1=new MyThread2(d2,":1pinky");
		mt1.start();
	}

}