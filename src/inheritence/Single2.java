package inheritence;

public class Single2 {

	public static void main(String[] args) {
       Elephent e=new Elephent();
       e.eat();
       e.dance();
	}

}
class Animal{
	String color="red";
	public void eat() {
		System.out.println("Animal is eating");
	}
}
class Elephent extends Animal{
	public void dance() {
		super.eat();
		System.out.println("Elephent is dancing");
	}
}
