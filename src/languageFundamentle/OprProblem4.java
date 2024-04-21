package languageFundamentle;
import java.util.Scanner;
public class OprProblem4 {

	public static void main(String[] args) {
//		WAP to check a no is prime or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no=:");
		int n = sc.nextInt();
		int c = 0;
		int x = 1;
		while (x <= n) {
			if (n % x == 0) {
				c++;
			}
			x++;
		}
		if (c==2) {
			System.out.println("prime");
		} 
		else {
			System.out.println(" not prime");
		}
	}
}
