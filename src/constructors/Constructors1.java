package constructors;

public class Constructors1 {
// Constructor Overloading
	public static void main(String[] args) {
     ConstructorDemo cd=new ConstructorDemo();
     cd.method();
     ConstructorDemo cd1=new ConstructorDemo(12);
	}

}
class ConstructorDemo{
//	non parameterized Constructor
	public ConstructorDemo() {
		System.out.println("Constructor is called");
}
	
	public void method() {
		System.out.println("Using Objects");
	}
	
// Parameterized Constructor
	public ConstructorDemo(int a) {
		int b=a;
		System.out.println("value of Objects="+b);
	}
}