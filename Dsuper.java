class A{
	A(){
		this(111);
		System.out.println("super:zero argument constructor");
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               	A(int x){
		this("manu");
		System.out.println("super:int argument constructor");
		System.out.println("super x:"+x);
		}
	A(String x){
		super();
		System.out.println("super:string argument constructor");
		System.out.println("super: x"+x);
	}
}
class B extends A{
	B(){
		this(123);
		System.out.println("sub:zero argument constructor");
	}
	B(int x){
		this("varun");
		System.out.println("sub:int argument constructor");
	}
	B(String x){
		super();
		System.out.println("sub:string argument constructor");
		}
}
public class Dsuper{
	public static void main(String arg[]){
		new B();
	}
}
                                                                                                                                  
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          