class A1{
}
class B1 extends A1
{
	B1(){
		System.out.println("this:"+this.hashCode());
		System.out.println("super:"+super.hashCode());
	}
}
class InheritanceDemo{
	public static void main(String args[]){
		B1 obj =new B1();
	}
}