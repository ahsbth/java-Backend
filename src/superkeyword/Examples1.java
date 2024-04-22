package superkeyword;

public class Examples1 {

	public static void main(String[] args) {
		Sub s=new Sub();
		s.eat();
	}
	Examples1(){
		System.out.println("Parent class Constructor");
	}
	
	public void eat() {
		System.out.println("Parent class Methode");
	}

}
class Sub extends Examples1{
	public void eat() {
		super.eat();// Super keyword is used to invoke the parent class method/constructor or data members.
		System.out.println("Sub class Method");
	}
}
