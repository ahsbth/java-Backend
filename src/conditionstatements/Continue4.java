package conditionstatements;

public class Continue4 {

	public static void main(String[] args) {
//		Write a Java program to print all lowercase letters from 'a' to 'z' except for vowels (a, e, i, o, u) using the continue statement.
	int n=97;
	while(n<=122) {
		char c=(char)n;
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			n++;
			continue;
		}
		System.out.println(c);
		n++;
	}
	}

}
 