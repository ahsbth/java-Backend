package interfaceInJava;

public class Example1 {

	public static void main(String[] args) {
		Myclass mcl=new Myclass();
		mcl.show1();
		mcl.show();
	}

}
interface list{
	int a=10;
	abstract public void show1();
}
class First implements list{
	int b=10;
	public void show1() {
		System.out.println("Interface variable value:"+a);
	}
}
class Myclass extends First implements list{
	public void show1() {
		System.out.println("interface variable value:"+a);
	}
	public void show() {
		System.out.println("First class variable value:"+b);
	}
}

