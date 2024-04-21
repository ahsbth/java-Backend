package languageFundamentle;
import java.util.Scanner;
public class OprProblem6 {
  public static void main(String args[]) {
//	  WAP to find the factorial of no
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a no:");
	  int n=sc.nextInt();
	  long fact=1;
	  while(n>0) {
		  fact=fact*n;
		  n--;
	  }
	  System.out.println("Factorial:"+fact);
	  sc.close();
  }
  
}
