package conditionstatements;

public class Continue2 {
//Write a Java program to print all numbers from 1 to 100 except multiples of 5 using the continue statement.
	public static void main(String[] args) {
		int n=1;
		while(n<=100) {
			if(n%5==0) {
				n++;
				continue;
			}
			System.out.println(n);
			n++;
		}
		

	}

}
