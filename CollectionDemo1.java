package manuse;
class Cricketer{
	int shirtNumber=99;
	String cricketerName="malinga";
}

class Stadium{
	int standNo=22;
	String stadiumName="rgis";
}
public class CollectionDemo1 {
	public static void main(String arg[]){
		Cricketer cric=new Cricketer();
		Stadium std=new Stadium();
		Object o[]=new Object[2];
		o[0]=cric;
		o[1]=std;
		System.out.println(o[0]);
		System.out.println(o[1]);
		Cricketer c=(Cricketer)o[0];
		Stadium s=(Stadium)o[1];
		System.out.println(c.shirtNumber+"...."+c.cricketerName);
		System.out.println(s.standNo+".........."+s.stadiumName);
	}

}
