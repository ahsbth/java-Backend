package inheritence;

public class Multilevel {

	public static void main(String[] args) {
   C c=new C();
   c.show();
   c.add();
   c.add2();
	}

}
class A{
	int a=10;
	public void show() {
		System.out.println("Class A Property:"+a);
	}
}
class B extends A{
	int b=10;
	public void add() {
		System.out.println("Sum is:"+(a+b));
	}
}
class C extends B{
	int c=12;
	public void add2() {
		System.out.println("Addition of all classes value="+(a+b+c));
	}
}
