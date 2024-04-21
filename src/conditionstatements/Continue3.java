package conditionstatements;

public class Continue3 {

	public static void main(String[] args) {
//Write a Java program to calculate the sum of all odd numbers between 1 and 50, skipping even numbers using the continue statement.
	int sum=0;
	int i=0;
	while(i<=50) {
		if(i%2==0) {
			i++;
			continue;
		}
		sum+=i;
		System.out.println(i);
		i++;
	}
	System.out.println("Sum is :"+sum);
	}

}
