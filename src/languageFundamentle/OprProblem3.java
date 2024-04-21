package languageFundamentle;

import java.util.Scanner;

public class OprProblem3 {

	public static void main(String[] args) {

// WAP to check a year is palindrome or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int y = sc.nextInt();
		if (y % 100 ==0) {
			if (y %400 == 0) {
				System.out.println("Leap year");
			} else {
				System.out.println("Not leap Year");
			}
		}
		if (y % 4 == 0) {
			System.out.println("leap year");
		} else {
			System.out.println("not leap year");
		}
	}

}
