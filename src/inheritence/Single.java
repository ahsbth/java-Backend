package inheritence;

public class Single {
	public static void main(String[] args) {
	
		Child c=new Child();
		c.show();
		c.swapp();
	}

}
class Parent{
	int a=10;
	public void show() {
		System.out.println("Parent class value:"+a);
	}
}
class Child extends Parent{
	 void swapp() {
		 int b=19;
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		 System.out.println("After swapping a is:"+a+"b is:"+b);
	}
	
}
