package languageFundamentle;
import java.util.Scanner;
public class Opreators {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter First no:");
     int a=sc.nextInt();
     System.out.println("Enter the Second no:");
     int b=sc.nextInt();
//     1. Arithmetical operator
     System.out.println("Addition="+(a+b));
     System.out.println("Substraction="+(a-b));
     System.out.println("Multiplication="+(a*b));
     System.out.println("Devision="+(a/b));
     System.out.println("Modulo Devision="+(a%b));
     
//    2.Relational/Comparison  operator(==,!=,>,<,>=,<=)
     if(a==b) {
    	 System.out.println("equal");
     }
     if(a!=b) {
    	 System.out.println("not equalto");
     }
     if(a>b) {
    	 System.out.println("y");
     }
     if(a<b) {
    	 System.out.println("y");
     }
     if(a>=b) {
          System.out.println("y");
	}
     if(a<=b) {
    	 System.out.println("y");
     }
//3.Logical operators(logical AND(&&),logical OR(||),logical NOT(!))
    if(a>b&&b>a) {
    	System.out.println(false);
    }
    if((a>b)&&(b>a)||(a<b)&&(b<a)) {
    	System.out.println(false);
    }
}
}
