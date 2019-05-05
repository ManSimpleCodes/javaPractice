class Student{
	private Student(){
	}
	static Student obj=new Student();
	static Student getStudent(){
		return obj;
	}
}
public class DeStudent{
	public static void main(String ar[]){
		Student obj1=Student.getStudent();
		System.out.println("obj1:"+obj1.hashCode());
		Student obj2=Student.getStudent();
		System.out.println("obj2:"+obj2.hashCode());
}
}