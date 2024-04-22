package encapsulation;

public class Exampl1 {

	public static void main(String[] args) {
		
		Employe emp=new Employe();
		emp.setId(123);
		emp.setName("Ahsan");
		System.out.println("Name:"+emp.getName()+"ID:"+emp.getId());
	}
}
// Employee class is fully Encapsulated class which have setter and getter method.
class Employe{
	private int id;
	private String name;
	
	public int getId() {
		return(id);
	}
	public void setId(int i) {
		this.id=i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
