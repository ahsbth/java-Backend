package languageFundamentle;
import java.util.Scanner;
public class OprProblem5 {

	public static void main(String[] args) {

//Write a Java program to reverse a given integer number.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		long rev=0;
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("Reverse=:"+rev);
	}

}
