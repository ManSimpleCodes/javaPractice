package manuse;

import java.util.ArrayList;

public class ArrayList1Collection {
	public static void main(String arg[]){
		ArrayList a1=new ArrayList(15);
		a1.add(10);
		a1.add(20);
		a1.add(30); 
		a1.add(40);
		a1.add(50);
		ArrayList a2=new ArrayList(a1);
		System.out.println("a1: "+a1);
		System.out.println("a2: "+a2);
		a1.add("manu");
		a1.add(true);
		a1.add(23.34);
		a1.add(23l);
		a1.add(100f);
		System.out.println("a1: "+a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.get(1));
		System.out.println(a1.size());
		System.out.println(a1.remove(4));
		System.out.println("a1: "+a1);
		System.out.println(a1.contains(true));
		System.out.println(a1.contains(false));
		System.out.println(a1.contains("manu"));
		System.out.println(a1.iterator().hasNext());
		a1.set(2, "ram");
		System.out.println("a1 ; "+a1);
		System.out.println("a2 : "+a2);
		System.out.println("====================");
		a1.removeAll(a2);//removes common or duplicate elements in a1
		System.out.println("a1 ; "+a1);
		System.out.println("a2 : "+a2);
		System.out.println("====================");
		a1.add(10);
		System.out.println("a1 ; "+a1);
		System.out.println("a2 : "+a2);
		System.out.println("====================");
		a2.removeAll(a1);//removes common or duplicate elements in a2
		System.out.println("a1 ; "+a1);
		System.out.println("a2 : "+a2);
		a1.retainAll(a2);
		System.out.println("a1 ; "+a1);
		System.out.println("a2 : "+a2);
		System.out.println("====================");
	}

}
