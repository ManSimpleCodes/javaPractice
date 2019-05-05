package manuse;

import java.util.Scanner;

class Student12{
	int sid;
	String sname;
	byte sage;
	String scourse;
	Student12(int sid,String sname,byte sage,String scourse){
		this.sid=sid;
		this.sname=sname;
		this.sage=sage;
		this.scourse=scourse;
	}
	
}
public class CollectionDemo {
	public static void main(String arg[]){
		Student12 st[]=new Student12[2];
		for(int i=0;i<2;i++){
			Scanner scan=new Scanner(System.in);
			System.out.println("enter student id");
			int sid=scan.nextInt();
			System.out.println("enter student name");
			String sname=scan.next();
			System.out.println("enter student age");
			byte sage=scan.nextByte();
			System.out.println("enter student course");
			String scourse=scan.next();
			
			st[i]=new Student12(sid,sname,sage,scourse);
			
		}
		for(int i=0;i<2;i++){
			System.out.println(st[i].sid+"......."+st[i].sname+"....."+st[i].sage+"....."+st[i].scourse);
		}
	}
	
}
