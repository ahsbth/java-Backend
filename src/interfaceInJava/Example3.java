package interfaceInJava;

public class Example3 {

	public static void main(String[] args) {
		
		D d=new D();
		d.showA();
		d.showB();
	}

}
interface A{
	int item1=12;
	void showA();
}
interface B{
	int item2=15;
	void showB();
}
class D implements A,B{
	public void showA() {
		System.out.println("List A item:"+item1);
	}
	public void showB() {
		System.out.println("List B item:"+item2);
	}
}

