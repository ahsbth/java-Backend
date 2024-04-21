package conditionstatements;
import java.util.Scanner;
public class NestedIF2 {

	public static void main(String[] args) {
// WAP to check a year is leap year or not.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year:");
		int y=sc.nextInt();
		if(y%100==0) {
			if(y%400==0) {
				System.out.println("Leap year");
			}
			else {
				System.out.println(" not Leap year");
			}
		}
		else {
			if(y%4==0) {
				System.out.println("Leap year");
			}
			else {
				System.out.println("not Leap year");
			}
		}
	}

}
