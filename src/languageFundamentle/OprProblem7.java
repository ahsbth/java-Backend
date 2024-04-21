package languageFundamentle;
import java.util.Scanner;
public class OprProblem7 {

	public static void main(String[] args) {
//		WAP to calculate sum of digits of a no.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum+=digit;
			n=n/10;
		}
     System.out.println("Sum of Digits="+sum);
	}

}
