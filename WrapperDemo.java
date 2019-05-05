public class WrapperDemo{
	public static void main(String arg[]){
//===============pdt to wc============
	
byte b=100;
Byte b1=Byte.valueOf(b);
System.out.println(b+"======"+b1);
float f=12.23F;
Float f1=Float.valueOf(f);
System.out.println(f+"======"+f1);
//=================wc to pdt=====
byte d=b1.byteValue();
float d1=f1.floatValue();
}
}

