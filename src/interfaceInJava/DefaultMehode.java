package interfaceInJava;

public class DefaultMehode {

	public static void main(String[] args) {
		Bca b=new Bca();
		b.show();
		b.check();

	}

}
interface Abc{
	int a=10;
	void show();
	default void check() {
		int f=a%10;
		if(f==0) {
			System.out.print("Even");
		}
		else {
			System.out.print("odd");
		}
	}
}
class Bca implements Abc{
	public void show() {
		System.out.print(+a+ "\tis");
	}
}
