package constructors;

public class Employe {

	public static void main(String[] args) {
		Constructor c=new Constructor();
		Constructor c1=new Constructor(122,"20000");
		Constructor c2=new Constructor(123,"Ahsan","23000");
		
		
		

	}

}
class Constructor{
	private String name,salary;
	private long id;
//	default constructor
	public Constructor() {
		id=0;
		System.out.println("id in default constructor:"+id);
	}
//	Parameterized constructor
	public Constructor(int id,String sal) {
		int i=id;
		String salary=sal;
		System.out.println("Employe id is:"+i+"Salary:"+salary);
	}
//	Parameterized Constructor
	public Constructor(int i,String n,String sal) {
		int id=i;
		String salary=sal;
		String name=n;
		System.out.println("Employ id is:"+id+"Salary"+salary+"Name:"+name);
	}
	
}