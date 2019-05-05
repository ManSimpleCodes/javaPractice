package manuse;

import java.util.ArrayList;

class Student123{
	int sid=101;
	String sname="manu";
	@Override
	public String toString(){
		return sid+"..."+sname;
	}
}
public class CollectionDemo12 {
	public static void main(String arga[]){
		Student123 s=new Student123();
		System.out.println(s);
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		System.out.println("al: "+al);
		al.add("manu");
		al.add(true);
		al.add(23.34);
		al.add(23l);
		al.add(100f);
		System.out.println("al:"+al);
	System.out.println(al.size());
	al.add(23.34);
	al.add(23l);
	al.add(100f);
	al.add(100f);
	al.add(100f);
	System.out.println("al:"+al);
	System.out.println(al.size());
	}
}
