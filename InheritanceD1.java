class A{
	static int a=m1();
	static {
		System.out.println("super-static block");
	}
	static int m1(){
		System.out.println("super-static m1 method");
		Sytem.out.println("a..:"+a);
		return 111;
	}
	int b=m2();
	{
		System.out.println("super-non-static block");
		System.out.println("=========");
	}
	int m2(){
		System.out.println("super non static m2 method");
		System.out.println("b:"+b);
		return 222;
	}
	A(){
		System.out.println("super class constructor");
	}
}
	public class InheritanceD1 extends A{
		static int c=m3();
		static{
			System.out.println("sub=static block");
		}
		static int m3(){
			System.out.println("sub-static m3-method");
			System.out.println("c:"+c);
			return 333;
	 	}
		int d=m4();
		{
			System.out.println("non static block--sub");
		}
		int m4(){
			System.out.println("non static block m4 method");
			System.out.println("d::"+d);
			return 444;
		}
		InheritanceD1(){
			System.out.println("sub class constructor");
		}
		public  static void main(String a[]){
			System.out.println("main method");
			new InheritanceD1();
}
}