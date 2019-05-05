public class ExpCat{
	public static void main(String [] manu){
	double d=12.34d;
	float d1=(float)d;
	long d2=(long)d;
	int d3=(int)d;
	short d4=(short)d;
	byte d5=(byte)d;
	int d6=(char)d;
	System.out.println(d1+"....."+d2+"........"+d3+"........"+d4+"......"+d5+"......."+d6);
	float d7=(byte)(short)(char)(int)(long)(float)(double)d;
	System.out.println(d7);
}
}
