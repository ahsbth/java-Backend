package methodeoverloading;

public class MethodeOV1 {

	public static void main(String[] args) {
	
	Method mth=new Method();
	mth.m1('a');
	mth.m2(2);
	mth.m3(4);
	mth.m4(5);
	}

}
class Method{
	
	     public void m1(char c) {
	       System.out.println("hi i'm methode 1");
	     }
	     
	     public void m2(int i) {
	    	 System.out.println("hi i'm methode 2");
	     }
	     public void m3(float f) {
	    	 System.out.println("hi i'm methode 3");
	     }
	     public void m4( double d) {
	    	 System.out.println("hi i'm methode 4");
	     }
}