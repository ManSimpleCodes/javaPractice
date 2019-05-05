class Fact1{
	int a=111;
	static Fact1 m1(){
		return new Fact1();
	}
	Fact2 m2(){
		return new Fact2();
	}
}



class Fact2{
	int b=222;
}



public class Fact{
	public static void main(String a[]){
		Fact1 obj1=Fact1.m1();
		System.out.println(obj1);
		System.out.println(obj1.a);
		System.out.println(obj1.m2());
		System.out.println(obj1.m2().b);
	}
}
	