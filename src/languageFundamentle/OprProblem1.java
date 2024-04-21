package languageFundamentle;

import java.util.Scanner;

public class OprProblem1 {

	public static void main(String[] args) {
//		write a program to check a no is even or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
