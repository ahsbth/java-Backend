package interfaceInJava;

public class Example2 {

	public static void main(String[] args) {
		MyA myc=new MyA();
		myc.showitem();
	}

}
interface list1{
	int item1=12;
}
interface list2 extends list1{
	int item2=13;
	public void showitem();
}
interface list3 extends list2{
	int item3=15;
}
class MyA implements list3{
	public void showitem() {
		System.out.println("Total item="+(item1+item2+item3));
	}
}
