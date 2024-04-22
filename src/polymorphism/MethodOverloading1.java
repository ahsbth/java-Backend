package polymorphism;

public class MethodOverloading1 {

	public static void main(String[] args) {
	
		MethodOverloading1 mov=new MethodOverloading1();
		mov.show(12);
		mov.show('d');
		mov.show(13.5f);
		mov.show(12,5);
	}

	
	public void show(int a)
	{
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
	public void show( float f)
	{
		System.out.println("Area of circle="+(3.14*f*f));
	}
	public void show(int a,int b)
	{
		System.out.println("Area of Rectangle="+2*(a+b));
	}
	public void show(char c)
	{
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}
}
